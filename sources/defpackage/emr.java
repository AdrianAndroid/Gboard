package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: emr  reason: default package */
/* loaded from: classes.dex */
public final class emr implements gyg {
    private end a;
    private final ArrayList b = new ArrayList();

    @Override // defpackage.gyg
    public final void b() {
        this.b.clear();
    }

    @Override // defpackage.gyg
    public final void c() {
        if (this.a != null) {
            if (!this.b.isEmpty()) {
                ArrayList arrayList = this.b;
                this.a.c = mhn.b((String[]) arrayList.toArray(new String[arrayList.size()]), 2);
            } else {
                this.a.c = null;
            }
        }
        this.b.clear();
    }

    @Override // defpackage.gyg
    public final void d(Object[] objArr) {
        if (this.a == null) {
            return;
        }
        String z = gyk.z(objArr);
        if (TextUtils.isEmpty(z)) {
            return;
        }
        this.b.add(z);
    }

    @Override // defpackage.gyg
    public final void g() {
        this.a = ene.b();
    }
}
