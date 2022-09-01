package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: dvu  reason: default package */
/* loaded from: classes.dex */
public final class dvu {
    public final dwd a;
    public final dvw b;
    public Context d;
    public dvl e;
    public dxa f;
    public boolean g;
    public dsl h;
    private final dwf i;
    private dwk k;
    private iou l;
    public bkk c = bkk.g;
    private bkk j = bkk.g;

    public dvu(dwh dwhVar, dwf dwfVar) {
        this.i = dwfVar;
        this.a = new dwd(dwhVar);
        this.b = new dvw(dwhVar);
    }

    private final void e() {
        iou iouVar = this.l;
        if (iouVar != null) {
            ioq.b(iouVar, true);
            this.l = null;
        }
    }

    public final void a() {
        dvl dvlVar = this.e;
        if (dvlVar != null) {
            dvlVar.i();
            ijf.k(jcj.b);
        }
        this.e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.bkk r19) {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvu.c(bkk):void");
    }

    public final void d(bkk bkkVar) {
        this.c = bkkVar;
        if (this.g) {
            c(bkkVar);
            b();
        }
        dvl dvlVar = this.e;
        if (dvlVar != null) {
            dvlVar.k(this.c.c);
        }
    }

    public final void b() {
        bkj bkjVar = this.c.d;
        if (bkjVar == null) {
            this.b.b();
            return;
        }
        dvw dvwVar = this.b;
        dvwVar.c = bkjVar;
        if (dvwVar.b.isPresent()) {
            return;
        }
        dvwVar.c();
    }
}
