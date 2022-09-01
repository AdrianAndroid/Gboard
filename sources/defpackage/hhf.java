package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: hhf  reason: default package */
/* loaded from: classes.dex */
public abstract class hhf implements ijj {
    public void a(List list, boolean z) {
    }

    public abstract void d(List list, boolean z);

    public final void e() {
        ijl.b().h(this, hhg.class, mjl.a);
    }

    public final void f() {
        ijl.b().d(this, hhg.class);
    }

    @Override // defpackage.ijj
    public final /* bridge */ /* synthetic */ void fd(ijg ijgVar) {
        hhg hhgVar = (hhg) ijgVar;
        List list = hhgVar.b;
        if (list != null) {
            try {
                d(list, hhgVar.d);
            } catch (RuntimeException e) {
                ((ltd) ((ltd) ((ltd) hhg.a.c()).i(e)).k("com/google/android/libraries/inputmethod/feedback/FillFeedbackPsdNotification$Listener", "onReceive", 55, "FillFeedbackPsdNotification.java")).w("Error calling fillFeedbackPsd against %s", this);
            }
        }
        List list2 = hhgVar.c;
        if (list2 != null) {
            try {
                a(list2, hhgVar.d);
            } catch (RuntimeException e2) {
                ((ltd) ((ltd) ((ltd) hhg.a.c()).i(e2)).k("com/google/android/libraries/inputmethod/feedback/FillFeedbackPsdNotification$Listener", "onReceive", 62, "FillFeedbackPsdNotification.java")).w("Error calling fillFeedbackPsbd against %s", this);
            }
        }
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fe(Class cls) {
    }
}
