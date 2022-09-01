package defpackage;

/* compiled from: PG */
/* renamed from: akl  reason: default package */
/* loaded from: classes.dex */
class akl extends wg {
    protected vt[] m;
    String n;
    int o;
    int p;

    public akl() {
        this.m = null;
        this.o = 0;
    }

    public akl(akl aklVar) {
        this.m = null;
        this.o = 0;
        this.n = aklVar.n;
        int i = aklVar.p;
        this.p = 0;
        this.m = kd.e(aklVar.m);
    }

    public boolean e() {
        return false;
    }

    public vt[] getPathData() {
        return this.m;
    }

    public String getPathName() {
        return this.n;
    }

    public void setPathData(vt[] vtVarArr) {
        if (!kd.c(this.m, vtVarArr)) {
            this.m = kd.e(vtVarArr);
            return;
        }
        vt[] vtVarArr2 = this.m;
        for (int i = 0; i < vtVarArr.length; i++) {
            vtVarArr2[i].a = vtVarArr[i].a;
            int i2 = 0;
            while (true) {
                float[] fArr = vtVarArr[i].b;
                if (i2 < fArr.length) {
                    vtVarArr2[i].b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }
}
