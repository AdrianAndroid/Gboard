package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import android.util.Printer;

/* compiled from: PG */
/* renamed from: gtq  reason: default package */
/* loaded from: classes.dex */
public final class gtq implements ifw {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/accounts/checker/ManagedDeviceCheckModule");
    private final AccountManager b;
    private final OnAccountsUpdateListener c;

    public gtq(final Context context) {
        this.b = AccountManager.get(context);
        this.c = new OnAccountsUpdateListener() { // from class: gtp
            @Override // android.accounts.OnAccountsUpdateListener
            public final void onAccountsUpdated(Account[] accountArr) {
                kcu.U(gxp.a().b.hQ(new evl(context, 8)), new cbx(15), mjl.a);
            }
        };
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        this.b.addOnAccountsUpdatedListener(this.c, null, true);
    }

    @Override // defpackage.ifw
    public final void gn() {
        this.b.removeOnAccountsUpdatedListener(this.c);
    }
}
