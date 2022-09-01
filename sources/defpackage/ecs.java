package defpackage;

/* compiled from: PG */
/* renamed from: ecs  reason: default package */
/* loaded from: classes.dex */
public final class ecs implements alj {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ecs(dxm dxmVar, int i) {
        this.b = i;
        this.a = dxmVar;
    }

    public ecs(ecu ecuVar, int i) {
        this.b = i;
        this.a = ecuVar;
    }

    @Override // defpackage.alj
    public final void a(int i) {
    }

    @Override // defpackage.alj
    public final void b(int i, float f, int i2) {
    }

    @Override // defpackage.alj
    public final void c(int i) {
        if (this.b == 0) {
            ((ecu) this.a).f.a(i);
            ((ecu) this.a).a.d(i);
            return;
        }
        ((dxm) this.a).f(i);
    }
}
