package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: iga  reason: default package */
/* loaded from: classes.dex */
public final class iga {
    public static final iga[] a = new iga[0];
    public final hhl b;
    public final String[] c;
    public final String d;
    public final boolean e;

    public iga(hhl hhlVar, String[] strArr, String str, boolean z) {
        this.b = hhlVar;
        this.e = z;
        this.d = lfd.d(str);
        if (strArr == null) {
            this.c = gvw.g;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            if (!TextUtils.isEmpty(str2)) {
                arrayList.add(str2);
            }
        }
        this.c = (String[]) arrayList.toArray(new String[0]);
    }

    public final ifz a() {
        return new ifz(this);
    }
}
