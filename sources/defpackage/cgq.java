package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: cgq  reason: default package */
/* loaded from: classes.dex */
public final class cgq extends dil {
    private static final lfy a = lfy.c(' ');
    private static final Pattern b = Pattern.compile("[A-Z]");

    public cgq(dij dijVar) {
        super(dijVar);
    }

    private static boolean e(String str) {
        if (str.contains("@")) {
            return false;
        }
        int length = str.length();
        return b.matcher(str).find() ? length >= 2 && length <= 30 : length >= 4 && length <= 30;
    }

    @Override // defpackage.dil
    protected final void a(String str, List list) {
        int i = 0;
        for (String str2 : a.i(str)) {
            if (e(str2)) {
                list.add(str2);
            }
            i++;
        }
        if (i != 2 || !e(str)) {
            return;
        }
        list.add(str);
    }
}
