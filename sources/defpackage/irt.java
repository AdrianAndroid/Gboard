package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: irt  reason: default package */
/* loaded from: classes.dex */
public class irt implements ijj {
    public void a(iru iruVar) {
        throw null;
    }

    public void d(iru iruVar) {
        throw null;
    }

    public final void e(Executor executor) {
        ijl.b().h(this, irv.class, executor);
    }

    public final void f(Executor executor) {
        ijl.b().c(this, irv.class, executor);
    }

    @Override // defpackage.ijj
    public final /* bridge */ /* synthetic */ void fd(ijg ijgVar) {
        irv irvVar = (irv) ijgVar;
        if (!irv.c(irvVar)) {
            ((ltd) ((ltd) irv.a.b()).k("com/google/android/libraries/inputmethod/statusmonitors/NetworkInfoNotification$Listener", "onReceive", 98, "NetworkInfoNotification.java")).H("onNetworkLost: networkState = %s, isAirplaneModeOn = %s", irvVar.b, irvVar.c);
            iru iruVar = irvVar.b;
            boolean z = irvVar.c;
            d(iruVar);
            return;
        }
        ((ltd) ((ltd) irv.a.b()).k("com/google/android/libraries/inputmethod/statusmonitors/NetworkInfoNotification$Listener", "onReceive", 93, "NetworkInfoNotification.java")).H("onNetworkAvailable: networkState = %s, isAirplaneModeOn = %s", irvVar.b, irvVar.c);
        a(irvVar.b);
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fe(Class cls) {
    }

    public final void g() {
        ijl.b().d(this, irv.class);
    }
}
