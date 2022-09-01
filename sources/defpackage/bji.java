package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bji  reason: default package */
/* loaded from: classes.dex */
public class bji extends bjm {
    public float b;
    public float c;
    final /* synthetic */ bjo d;

    public bji(bjo bjoVar, float f, float f2) {
        this.d = bjoVar;
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.bjm
    public void a(String str) {
        if (this.d.i()) {
            bjo bjoVar = this.d;
            bjk bjkVar = bjoVar.f;
            if (bjkVar.b) {
                bjoVar.a.drawText(str, this.b, this.c, bjkVar.d);
            }
            bjo bjoVar2 = this.d;
            bjk bjkVar2 = bjoVar2.f;
            if (bjkVar2.c) {
                bjoVar2.a.drawText(str, this.b, this.c, bjkVar2.e);
            }
        }
        this.b += this.d.f.d.measureText(str);
    }
}
