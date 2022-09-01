package defpackage;

/* compiled from: PG */
/* renamed from: kv  reason: default package */
/* loaded from: classes.dex */
public final class kv {
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean h;
    public boolean i;
    public boolean a = true;
    public int f = 0;
    public int g = 0;

    public final boolean a(ml mlVar) {
        int i = this.c;
        return i >= 0 && i < mlVar.a();
    }

    public final String toString() {
        return "LayoutState{mAvailable=" + this.b + ", mCurrentPosition=" + this.c + ", mItemDirection=" + this.d + ", mLayoutDirection=" + this.e + ", mStartLine=" + this.f + ", mEndLine=" + this.g + '}';
    }
}
