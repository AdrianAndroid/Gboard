package j$.util.stream;

import j$.util.function.Predicate;
import j$.util.function.ToIntFunction;
import java.util.HashSet;
import java.util.Set;

/* renamed from: j$.util.stream.j  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0036j extends V0 {
    public final /* synthetic */ int b;
    Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0036j(AbstractC0015c abstractC0015c, X0 x0, int i) {
        super(x0);
        this.b = i;
        this.c = abstractC0015c;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.b;
        X0 x0 = this.a;
        switch (i) {
            case 0:
                if (!((Set) this.c).contains(obj)) {
                    ((Set) this.c).add(obj);
                    x0.accept((X0) obj);
                    return;
                }
                return;
            case 1:
                if (((Predicate) ((C0069v) this.c).t).test(obj)) {
                    x0.accept((X0) obj);
                    return;
                }
                return;
            case 2:
                x0.accept((X0) ((P0) this.c).t.apply(obj));
                return;
            default:
                x0.accept(((ToIntFunction) ((C0071w) this.c).t).applyAsInt(obj));
                return;
        }
    }

    @Override // j$.util.stream.X0
    public final void c(long j) {
        int i = this.b;
        X0 x0 = this.a;
        switch (i) {
            case 0:
                this.c = new HashSet();
                x0.c(-1L);
                return;
            case 1:
                x0.c(-1L);
                return;
            default:
                x0.c(j);
                return;
        }
    }

    @Override // j$.util.stream.V0, j$.util.stream.X0
    public final void j() {
        switch (this.b) {
            case 0:
                this.c = null;
                this.a.j();
                return;
            default:
                super.j();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0036j(X0 x0) {
        super(x0);
        this.b = 0;
    }
}
