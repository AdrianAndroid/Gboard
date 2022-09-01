package defpackage;

/* compiled from: PG */
/* renamed from: em  reason: default package */
/* loaded from: classes.dex */
final class em extends ep {
    private final akf a;

    public em(akf akfVar) {
        this.a = akfVar;
    }

    @Override // defpackage.ep
    public final void a() {
        this.a.start();
    }

    @Override // defpackage.ep
    public final void b() {
        this.a.stop();
    }
}
