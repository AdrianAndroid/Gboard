package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fcp  reason: default package */
/* loaded from: classes.dex */
public final class fcp {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final AtomicBoolean c = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        this.a.set(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(boolean z) {
        this.c.set(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(boolean z) {
        this.b.set(z);
    }

    public final boolean d() {
        return this.a.get();
    }

    public final boolean e() {
        return this.c.get();
    }

    public final boolean f() {
        return this.b.get();
    }

    public final boolean g() {
        return this.a.get() || this.b.get() || this.c.get();
    }

    public final String toString() {
        String str = true != this.b.get() ? "NOT open" : "open";
        String str2 = true != this.a.get() ? "NOT listening" : "listening";
        String str3 = true != this.c.get() ? "NOT running" : "running";
        return "VoiceTranscriptionState : UI = " + str + " : Microphone = " + str2 + " : Recognizer = " + str3;
    }
}
