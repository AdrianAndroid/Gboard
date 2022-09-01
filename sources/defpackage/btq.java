package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: btq  reason: default package */
/* loaded from: classes.dex */
public final class btq extends dil {
    public btq(dij dijVar) {
        super(dijVar);
    }

    @Override // defpackage.dil
    public final void a(String str, List list) {
        int length = str.length();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (jbs.i(codePointAt)) {
                if (true != z) {
                    i2 = i;
                }
                z = true;
            } else if (z) {
                if (str.codePointCount(i2, i) > 1) {
                    list.add(str.substring(i2, i));
                }
                z = false;
            }
            i += Character.charCount(codePointAt);
        }
        if (z && str.codePointCount(i2, length) > 1) {
            if (i2 == 0) {
                list.add(str);
            } else {
                list.add(str.substring(i2, length));
            }
        }
        if (list.size() == 1) {
            String str2 = (String) list.get(0);
            if (str2.codePointCount(0, str2.length()) < 3) {
                return;
            }
            list.add(jbs.q(str2));
        }
    }
}
