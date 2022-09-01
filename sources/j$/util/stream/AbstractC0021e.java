package j$.util.stream;

/* renamed from: j$.util.stream.e  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC0021e {
    protected int a;
    protected int b;
    protected long[] c;

    public abstract void clear();

    public final long count() {
        int i = this.b;
        return i == 0 ? this.a : this.c[i] + this.a;
    }
}
