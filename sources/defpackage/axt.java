package defpackage;

/* compiled from: PG */
/* renamed from: axt  reason: default package */
/* loaded from: classes.dex */
public final class axt implements axm {
    private final /* synthetic */ int a;

    public axt(int i) {
        this.a = i;
    }

    @Override // defpackage.axm
    public final int b() {
        return this.a != 0 ? 1 : 4;
    }

    @Override // defpackage.axm
    public final /* synthetic */ Object c(int i) {
        return this.a != 0 ? new byte[i] : new int[i];
    }

    @Override // defpackage.axm
    public final /* synthetic */ int a(Object obj) {
        if (this.a == 0) {
            return ((int[]) obj).length;
        }
        return ((byte[]) obj).length;
    }
}
