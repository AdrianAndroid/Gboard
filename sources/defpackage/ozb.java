package defpackage;

/* compiled from: PG */
/* renamed from: ozb  reason: default package */
/* loaded from: classes2.dex */
public final class ozb {
    public final int a;
    public final int b;
    public final oza[] c;
    public final /* synthetic */ ozc d;

    public ozb(ozc ozcVar, int i, int i2) {
        this.d = ozcVar;
        this.a = i;
        this.b = (1 << i2) - 1;
        this.c = new oza[1 << (i + i2)];
        int i3 = 0;
        while (true) {
            oza[] ozaVarArr = this.c;
            if (i3 < ozaVarArr.length) {
                ozaVarArr[i3] = new oza(this);
                i3++;
            } else {
                return;
            }
        }
    }
}
