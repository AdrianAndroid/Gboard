package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: dtu  reason: default package */
/* loaded from: classes.dex */
public final class dtu {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/nga/impl/input/TextToSpeechController");
    public static final AtomicReference b = new AtomicReference();
    public static final Bundle c;
    public final Context d;
    public final Executor e;
    public mko f;
    public rj g;

    static {
        Bundle bundle = new Bundle();
        c = bundle;
        bundle.putString("utteranceId", "SmartDictation TTS");
    }

    public dtu(Context context) {
        mks a2 = gxo.a(6);
        this.d = context;
        this.e = a2;
    }
}
