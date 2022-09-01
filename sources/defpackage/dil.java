package defpackage;

import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* renamed from: dil  reason: default package */
/* loaded from: classes.dex */
public class dil implements gyg {
    private final dij a;
    private dio b;
    private final List c = lre.A();

    static {
        lug lugVar = hin.a;
    }

    public dil(dij dijVar) {
        this.a = dijVar;
    }

    protected void a(String str, List list) {
        list.add(str);
    }

    @Override // defpackage.gyg
    public final void b() {
        dio dioVar = this.b;
        if (dioVar == null) {
            return;
        }
        dioVar.close();
        this.b = null;
        this.c.clear();
    }

    @Override // defpackage.gyg
    public final void c() {
        dio dioVar = this.b;
        if (dioVar == null) {
            return;
        }
        boolean b = dioVar.b();
        this.b.close();
        this.b = null;
        this.c.clear();
        if (!b) {
            return;
        }
        this.a.I(2);
    }

    @Override // defpackage.gyg
    public final void d(Object[] objArr) {
        String z = gyk.z(objArr);
        boolean D = gyk.D(objArr);
        int d = gyk.d(objArr);
        if (this.b == null || TextUtils.isEmpty(z)) {
            return;
        }
        int i = d + 1;
        if (D) {
            i += 10;
        }
        a(z, this.c);
        for (String str : this.c) {
            this.b.c(str, i);
        }
        this.c.clear();
    }

    @Override // defpackage.gyg
    public final void g() {
        dio dioVar = new dio(this.a, 2);
        this.b = dioVar;
        if (!dioVar.a()) {
            this.b = null;
        } else {
            this.c.clear();
        }
    }
}
