package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ijd  reason: default package */
/* loaded from: classes.dex */
public final class ijd extends iiz {
    final /* synthetic */ ije b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ijd(ije ijeVar, Class cls) {
        super(cls);
        this.b = ijeVar;
    }

    @Override // defpackage.ijj
    public final /* bridge */ /* synthetic */ void fd(ijg ijgVar) {
        iiy iiyVar = (iiy) ijgVar;
        synchronized (this.b) {
            ije ijeVar = this.b;
            if (!ijeVar.a) {
                ijeVar.a = true;
                ijeVar.b();
            } else {
                String a = a();
                throw new IllegalStateException(a + " component's status is not changed");
            }
        }
    }

    @Override // defpackage.iiz, defpackage.ijj
    public final void fe(Class cls) {
        synchronized (this.b) {
            if (!this.b.a) {
                ((ltd) ((ltd) ijf.a.d()).k("com/google/android/libraries/inputmethod/notificationcenter/ComponentsReadinessManager$SingleComponentListener$ComponentTagListener", "onClear", 618, "ComponentsReadinessManager.java")).w("%s component's status is not changed", a());
            }
            ije ijeVar = this.b;
            ijeVar.a = false;
            ijeVar.c();
        }
    }
}
