package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: bcm  reason: default package */
/* loaded from: classes.dex */
public final class bcm extends bce implements axe {
    public bcm(bck bckVar) {
        super(bckVar);
    }

    @Override // defpackage.axh
    public final int a() {
        bcq bcqVar = ((bck) this.a).a.a;
        auk aukVar = (auk) bcqVar.a;
        return aukVar.a.limit() + aukVar.c.length + (aukVar.d.length * 4) + bcqVar.j;
    }

    @Override // defpackage.axh
    public final Class b() {
        return bck.class;
    }

    @Override // defpackage.bce, defpackage.axe
    public final void d() {
        ((bck) this.a).a().prepareToDraw();
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [axn, java.lang.Object] */
    @Override // defpackage.axh
    public final void e() {
        ?? r5;
        ((bck) this.a).stop();
        bck bckVar = (bck) this.a;
        bckVar.b = true;
        bcq bcqVar = bckVar.a.a;
        bcqVar.b.clear();
        bcqVar.d();
        bcqVar.f();
        bco bcoVar = bcqVar.e;
        if (bcoVar != null) {
            bcqVar.c.l(bcoVar);
            bcqVar.e = null;
        }
        bco bcoVar2 = bcqVar.g;
        if (bcoVar2 != null) {
            bcqVar.c.l(bcoVar2);
            bcqVar.g = null;
        }
        bco bcoVar3 = bcqVar.i;
        if (bcoVar3 != null) {
            bcqVar.c.l(bcoVar3);
            bcqVar.i = null;
        }
        auk aukVar = (auk) bcqVar.a;
        aukVar.f = null;
        byte[] bArr = aukVar.c;
        if (bArr != null) {
            aukVar.j.f(bArr);
        }
        int[] iArr = aukVar.d;
        if (iArr != null && (r5 = aukVar.j.b) != 0) {
            r5.c(iArr);
        }
        Bitmap bitmap = aukVar.g;
        if (bitmap != null) {
            aukVar.j.e(bitmap);
        }
        aukVar.g = null;
        aukVar.a = null;
        aukVar.h = null;
        byte[] bArr2 = aukVar.b;
        if (bArr2 != null) {
            aukVar.j.f(bArr2);
        }
        bcqVar.f = true;
    }
}
