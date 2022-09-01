package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bjn  reason: default package */
/* loaded from: classes.dex */
public final class bjn extends bjm {
    public float a = 0.0f;
    final /* synthetic */ bjo b;

    public bjn(bjo bjoVar) {
        this.b = bjoVar;
    }

    @Override // defpackage.bjm
    public final void a(String str) {
        this.a += this.b.f.d.measureText(str);
    }
}
