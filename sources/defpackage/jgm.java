package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* renamed from: jgm  reason: default package */
/* loaded from: classes.dex */
public abstract class jgm {
    private Choreographer.FrameCallback a;

    public abstract void a(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Choreographer.FrameCallback b() {
        if (this.a == null) {
            this.a = new cgh(this, 3);
        }
        return this.a;
    }
}
