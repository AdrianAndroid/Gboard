package defpackage;

/* compiled from: PG */
/* renamed from: okd  reason: default package */
/* loaded from: classes2.dex */
public abstract class okd extends okc implements olj {
    public okd(ojv ojvVar) {
        super(ojvVar);
    }

    @Override // defpackage.olj
    public final int f() {
        return 2;
    }

    @Override // defpackage.ojz
    public final String toString() {
        if (this.g == null) {
            int i = olr.a;
            String j = oll.j(this);
            oll.d(j, "renderLambdaToString(this)");
            return j;
        }
        return super.toString();
    }
}
