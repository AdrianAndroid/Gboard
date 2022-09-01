package defpackage;

/* compiled from: PG */
/* renamed from: fbx  reason: default package */
/* loaded from: classes.dex */
public final class fbx implements fev {
    public final /* synthetic */ fby a;

    public fbx(fby fbyVar) {
        this.a = fbyVar;
    }

    @Override // defpackage.fev
    public final void a() {
        if (!this.a.i.f()) {
            ((ltd) ((ltd) fby.a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceInputManager$RecognizerCallback", "onListening", 836, "VoiceInputManager.java")).w("onListening() : Cannot run with %s", this.a.i);
            return;
        }
        fca fcaVar = this.a.f;
        fcaVar.b.execute(new fal(fcaVar, 16));
    }

    @Override // defpackage.fev
    public final void b() {
        if (fby.n()) {
            this.a.n.b();
        }
    }

    @Override // defpackage.fev
    public final void c() {
        if (fby.n()) {
            this.a.l.c();
            this.a.n.c();
        }
        if (!this.a.i.f()) {
            ((ltd) ((ltd) fby.a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceInputManager$RecognizerCallback", "onRecognizing", 851, "VoiceInputManager.java")).w("onRecognizing() : Cannot run with %s", this.a.i);
            return;
        }
        fca fcaVar = this.a.f;
        fcaVar.b.execute(new fal(fcaVar, 17));
        fby fbyVar = this.a;
        fbyVar.c.execute(new fal(fbyVar, 14));
    }

    @Override // defpackage.fev
    public final void d(int i) {
        if (this.a.i.f()) {
            fca fcaVar = this.a.f;
            fcaVar.b.execute(new dob(fcaVar, i, 5));
        }
    }

    @Override // defpackage.fev
    public final void e() {
        ((ltd) ((ltd) fby.a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceInputManager$RecognizerCallback", "onStartFailure", 807, "VoiceInputManager.java")).t("onStartFailure()");
        this.a.k(fff.INITIALIZATION_ERROR);
    }

    @Override // defpackage.fev
    public final void f() {
        this.a.l.b();
        fby fbyVar = this.a;
        fbyVar.c.execute(new fal(fbyVar, 13));
    }

    @Override // defpackage.fev
    public final void g() {
        ((ltd) ((ltd) fby.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceInputManager$RecognizerCallback", "onStopListening", 861, "VoiceInputManager.java")).t("onStopListening()");
        this.a.h(fff.OTHER);
    }

    @Override // defpackage.fev
    public final void h() {
        ((ltd) ((ltd) fby.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceInputManager$RecognizerCallback", "onStopRecognition", 867, "VoiceInputManager.java")).t("onStopRecognition()");
        this.a.k(fff.OTHER);
    }

    @Override // defpackage.fev
    public final void i(bnq bnqVar) {
        bnqVar.a.size();
        if (fby.n()) {
            this.a.n.a();
        } else {
            this.a.l.a();
        }
        fby fbyVar = this.a;
        fbf fbfVar = fbyVar.s;
        if (fbfVar != null && !fbfVar.f) {
            fbfVar.f = true;
        }
        fbyVar.c.execute(new elr(this, bnqVar, 17));
    }

    @Override // defpackage.fev
    public final void j(int i) {
        ((ltd) ((ltd) fby.a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceInputManager$RecognizerCallback", "onRecognitionError", 873, "VoiceInputManager.java")).t("onRecognitionError()");
        fff fffVar = fff.RECOGNITION_ERROR;
        if (i == 2) {
            fffVar = fff.RECOGNITION_NETWORK_ERROR;
        } else if (i == 1) {
            fffVar = fff.RECOGNITION_AUDIO_ERROR;
        }
        this.a.k(fffVar);
    }
}
