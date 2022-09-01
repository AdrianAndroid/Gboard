package defpackage;

import android.content.Context;
import j$.util.function.Consumer;

/* compiled from: PG */
/* renamed from: dnt  reason: default package */
/* loaded from: classes.dex */
final class dnt implements inm {
    public final idi a;
    public volatile boolean b;

    public dnt(Context context, idi idiVar) {
        this.a = idiVar;
        ino M = ino.M(context);
        this.b = ieh.s(M);
        M.X(this, ieh.d);
    }

    public final void a(mbh mbhVar, int i, long j, long j2, Consumer consumer) {
        if (this.b) {
            nfh t = mux.g.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mux muxVar = (mux) t.b;
            mbhVar.getClass();
            muxVar.c = mbhVar;
            int i2 = muxVar.a | 2;
            muxVar.a = i2;
            int i3 = i2 | 1;
            muxVar.a = i3;
            muxVar.b = i;
            int i4 = i3 | 4;
            muxVar.a = i4;
            muxVar.d = j;
            muxVar.a = i4 | 8;
            muxVar.e = j2;
            consumer.accept((mux) t.cz());
            this.a.f(mbhVar, i, j, j2);
        }
    }

    @Override // defpackage.inm
    public final void go(ino inoVar, String str) {
        this.b = ieh.s(inoVar);
    }
}
