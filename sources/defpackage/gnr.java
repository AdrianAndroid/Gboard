package defpackage;

import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;

/* compiled from: PG */
/* renamed from: gnr  reason: default package */
/* loaded from: classes.dex */
public final class gnr implements mka {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public gnr(Delight5Facilitator delight5Facilitator, gxu gxuVar, int i) {
        this.c = i;
        this.b = delight5Facilitator;
        this.a = gxuVar;
    }

    public gnr(hiu hiuVar, hiu hiuVar2, int i) {
        this.c = i;
        this.a = hiuVar;
        this.b = hiuVar2;
    }

    public gnr(Class cls, gnl gnlVar, int i) {
        this.c = i;
        this.a = cls;
        this.b = gnlVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [hiu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [gnl, java.lang.Object] */
    @Override // defpackage.mka
    public final void a(Throwable th) {
        int i = this.c;
        if (i == 0) {
            Class a = gno.a((Class) this.a);
            try {
                this.b.a(th);
            } finally {
                gno.a(a);
            }
        } else if (i == 1) {
            ((ltd) ((ltd) Delight5Facilitator.a.a(hip.a).i(th)).k("com/google/android/apps/inputmethod/libs/delight5/Delight5Facilitator$4", "onFailure", 1153, "Delight5Facilitator.java")).w("doAfterMainLmLoaded(): Failed to execute runnable %s", this.a);
            if (!"check-main-lm".equals(((gxu) this.a).i)) {
                return;
            }
            ((Delight5Facilitator) this.b).k.e(cap.MAIN_LM_ERRORS, mvc.CLIENT_FAIL_TO_CHECK_MAIN_LM);
        } else {
            this.b.a(th);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [hiu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [gnl, java.lang.Object] */
    @Override // defpackage.mka
    public final void b(Object obj) {
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                ((gxu) this.a).run();
                return;
            } else {
                this.a.a(obj);
                return;
            }
        }
        Class a = gno.a((Class) this.a);
        try {
            this.b.b(obj);
        } finally {
            gno.a(a);
        }
    }
}
