package com.google.frameworks.client.data.android.binder;

import android.os.IBinder;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AndroidServiceServerBuilder$InternalServerLifecycle implements aft, lgb {
    private final afy a;
    private final nvk b;
    private final IBinder c;
    private boolean d;

    public AndroidServiceServerBuilder$InternalServerLifecycle(afy afyVar, nvk nvkVar, IBinder iBinder) {
        this.a = afyVar;
        this.b = nvkVar;
        this.c = iBinder;
        afyVar.I().b(this);
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.lgb
    /* renamed from: b */
    public final synchronized IBinder a() {
        if (!this.d) {
            try {
                this.d = true;
                nvk nvkVar = this.b;
                synchronized (((oeu) nvkVar).m) {
                    jdg.G(!((oeu) nvkVar).h, "Already started");
                    jdg.G(!((oeu) nvkVar).i, "Shutting down");
                    ((oeu) nvkVar).l.c(new opu((oeu) nvkVar));
                    ?? a = ((oeu) nvkVar).d.a();
                    jdg.Q(a, "executor");
                    ((oeu) nvkVar).e = a;
                    ((oeu) nvkVar).h = true;
                }
            } catch (IOException e) {
                ((ltd) ((ltd) ((ltd) moq.a.c()).i(e)).k("com/google/frameworks/client/data/android/binder/AndroidServiceServerBuilder$InternalServerLifecycle", "get", 267, "AndroidServiceServerBuilder.java")).w("Unable to start server %s", this.b);
            }
        }
        return this.c;
    }

    @Override // defpackage.aft
    public final void hS(afv afvVar, afo afoVar) {
        if (afoVar == afo.ON_DESTROY) {
            this.a.I().d(this);
            nvk nvkVar = this.b;
            oeu oeuVar = (oeu) nvkVar;
            synchronized (oeuVar.m) {
                if (!((oeu) nvkVar).i) {
                    ((oeu) nvkVar).i = true;
                    boolean z = ((oeu) nvkVar).h;
                    if (!z) {
                        ((oeu) nvkVar).n = true;
                        ((oeu) nvkVar).a();
                    }
                    if (z) {
                        oeuVar.l.a();
                    }
                }
            }
            nvu f = nvu.l.f("Server shutdownNow invoked");
            synchronized (oeuVar.m) {
                if (((oeu) nvkVar).j != null) {
                    return;
                }
                ((oeu) nvkVar).j = f;
                ArrayList arrayList = new ArrayList(((oeu) nvkVar).o);
                boolean z2 = ((oeu) nvkVar).k;
                if (!z2) {
                    return;
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((oey) arrayList.get(i)).k(f);
                }
            }
        }
    }
}
