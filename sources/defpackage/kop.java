package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* renamed from: kop  reason: default package */
/* loaded from: classes.dex */
public final class kop {
    public static final Account a = new Account("shared", "mobstore");

    public static Account a(String str) {
        if (d(str)) {
            return a;
        }
        int indexOf = str.indexOf(58);
        kqn.d(indexOf >= 0, "Malformed account", new Object[0]);
        return new Account(str.substring(indexOf + 1), str.substring(0, indexOf));
    }

    public static String b(Account account) {
        boolean z = true;
        kqn.d(account.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        kqn.d(account.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        if (account.name.indexOf(47) != -1) {
            z = false;
        }
        kqn.d(z, "Account name contains '/'.", new Object[0]);
        if (c(account)) {
            return "shared";
        }
        String str = account.type;
        String str2 = account.name;
        return str + ":" + str2;
    }

    public static boolean c(Account account) {
        return a.equals(account);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(String str) {
        return "shared".equals(str);
    }
}
