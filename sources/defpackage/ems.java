package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ems  reason: default package */
/* loaded from: classes.dex */
public final class ems implements gyg {
    private end a = null;
    private boolean b;
    private ArrayList c;

    @Override // defpackage.gyg
    public final void b() {
    }

    @Override // defpackage.gyg
    public final void d(Object[] objArr) {
        if (this.a == null) {
            return;
        }
        String m = gyo.m(objArr);
        if (TextUtils.isEmpty(m)) {
            return;
        }
        if (TextUtils.isEmpty(gyo.i(objArr))) {
            this.a.f(m);
        }
        if (!this.b) {
            return;
        }
        this.c.add(m);
    }

    @Override // defpackage.gyg
    public final void g() {
        end b = ene.b();
        this.a = b;
        if (b != null) {
            b.c();
        }
        boolean booleanValue = ((Boolean) enl.a.c()).booleanValue();
        this.b = booleanValue;
        if (booleanValue) {
            this.c = new ArrayList();
        }
    }

    @Override // defpackage.gyg
    public final void c() {
        ArrayList arrayList;
        end endVar = this.a;
        if (endVar != null) {
            if (!this.b || (arrayList = this.c) == null) {
                endVar.h(null);
            } else {
                this.a.h(mhn.b((String[]) arrayList.toArray(new String[arrayList.size()]), 2));
            }
        }
    }
}
