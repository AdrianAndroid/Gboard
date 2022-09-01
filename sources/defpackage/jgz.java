package defpackage;

/* compiled from: PG */
/* renamed from: jgz  reason: default package */
/* loaded from: classes.dex */
final class jgz extends jez {
    final /* synthetic */ jhb a;

    public jgz(jhb jhbVar) {
        this.a = jhbVar;
    }

    @Override // defpackage.jez
    public final void l(double d) {
        jhb jhbVar = this.a;
        jhbVar.b = (float) d;
        jhbVar.invalidateSelf();
    }
}
