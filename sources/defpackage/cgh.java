package defpackage;

import android.view.Choreographer;
import com.google.android.apps.inputmethod.libs.proactivesuggestion.ProactiveSuggestionsClippableHolderView;

/* compiled from: PG */
/* renamed from: cgh  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cgh implements Choreographer.FrameCallback {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cgh(cgl cglVar, int i) {
        this.b = i;
        this.a = cglVar;
    }

    public /* synthetic */ cgh(ProactiveSuggestionsClippableHolderView proactiveSuggestionsClippableHolderView, int i) {
        this.b = i;
        this.a = proactiveSuggestionsClippableHolderView;
    }

    public /* synthetic */ cgh(Runnable runnable, int i) {
        this.b = i;
        this.a = runnable;
    }

    public /* synthetic */ cgh(jgm jgmVar, int i) {
        this.b = i;
        this.a = jgmVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.b;
        if (i == 0) {
            ((cgl) this.a).h();
        } else if (i == 1) {
            this.a.run();
        } else if (i == 2) {
            ((ProactiveSuggestionsClippableHolderView) this.a).k();
        } else {
            ((jgm) this.a).a(j);
        }
    }
}
