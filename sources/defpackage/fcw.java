package defpackage;

/* compiled from: PG */
/* renamed from: fcw  reason: default package */
/* loaded from: classes.dex */
public final class fcw {
    public static final fcw a = new fcw(ieh.j(), fbv.a);
    public volatile long b;
    public volatile long c = -1;
    public volatile long d = -1;
    public volatile long e = -1;
    public volatile long f = -1;
    public volatile long g = -1;
    public volatile long h = -1;
    public volatile long i = -1;
    public volatile long j = -1;
    public volatile long k = -1;
    public final idk l;
    public final fbv m;

    public fcw(idk idkVar, fbv fbvVar) {
        this.l = idkVar;
        this.m = fbvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(long j) {
        if (this.b <= 0 || this.f >= 0) {
            return;
        }
        this.f = j - this.b;
        this.l.g(fbp.AIAI_RECOGNIZER_FIRST_TEXT_RECEIVED_TIME, this.f);
        if (this.c > 0 && this.h < 0) {
            this.h = j - this.c;
            this.l.g(fbp.AIAI_RECOGNIZER_SPEECH_START_TO_FIRST_TEXT_TIME, this.h);
        }
        if (this.d <= 0 || this.k >= 0) {
            return;
        }
        this.k = j - this.d;
        this.l.g(fbp.AIAI_RECOGNIZER_MIC_OPEN_TO_FIRST_TEXT_TIME, this.k);
    }
}
