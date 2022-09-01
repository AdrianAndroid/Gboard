package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fab  reason: default package */
/* loaded from: classes.dex */
public final class fab implements AudioManager.OnAudioFocusChangeListener {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/AudioFocusHandler");
    private final AudioManager b;
    private final AudioFocusRequest c;
    private final AtomicBoolean d = new AtomicBoolean(false);

    public fab(Context context) {
        AudioFocusRequest audioFocusRequest;
        this.b = (AudioManager) context.getSystemService("audio");
        if (d()) {
            audioFocusRequest = new AudioFocusRequest.Builder(4).setOnAudioFocusChangeListener(this).setAudioAttributes(new AudioAttributes.Builder().setUsage(13).setContentType(4).build()).setAcceptsDelayedFocusGain(false).setWillPauseWhenDucked(false).build();
        } else {
            audioFocusRequest = null;
        }
        this.c = audioFocusRequest;
    }

    protected static final boolean d() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public final synchronized void a() {
        if (!this.d.compareAndSet(true, false)) {
            return;
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/AudioFocusHandler", "releaseFocus", 57, "AudioFocusHandler.java")).t("releasing audio focus.");
        if (d()) {
            this.b.abandonAudioFocusRequest(this.c);
        } else {
            this.b.abandonAudioFocus(this);
        }
    }

    public final synchronized void b() {
        int requestAudioFocus;
        if (!this.d.compareAndSet(false, true)) {
            return;
        }
        if (d()) {
            requestAudioFocus = this.b.requestAudioFocus(this.c);
        } else {
            requestAudioFocus = this.b.requestAudioFocus(this, 3, 4);
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/AudioFocusHandler", "requestFocus", 47, "AudioFocusHandler.java")).u("audio focus request with response %d.", requestAudioFocus);
    }

    public final synchronized void c() {
        if (this.d.get()) {
            a();
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
    }
}
