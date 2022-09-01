package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: dzz  reason: default package */
/* loaded from: classes.dex */
public final class dzz {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/contentsuggestion/ContentSuggestionQueriesDispatcher");
    public final lgb b;
    public final Executor c;
    private final Executor d;
    private boolean f = false;
    private final dzy e = new dzy(this);

    public dzz(Context context) {
        drf drfVar = new drf(context, 6);
        mks c = gxo.c(5);
        gyc gycVar = gyc.b;
        this.b = drfVar;
        this.d = c;
        this.c = gycVar;
    }

    public final void a() {
        if (!this.f) {
            this.e.d(hqj.b());
            this.e.f(this.d);
            this.f = true;
        }
    }

    public final void b() {
        if (this.f) {
            this.e.h();
            this.e.d(null);
            this.f = false;
        }
    }
}
