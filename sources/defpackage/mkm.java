package defpackage;

/* compiled from: PG */
/* renamed from: mkm  reason: default package */
/* loaded from: classes.dex */
public final class mkm implements Runnable {
    public static final /* synthetic */ mkm a = new mkm(3);
    private final /* synthetic */ int b;

    public mkm(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
            return;
        }
        pbe.c();
    }
}
