package defpackage;

import android.view.animation.DecelerateInterpolator;
import com.google.android.libraries.search.p6glow.AssistantP6GlowView;
import j$.time.Duration;
import java.util.Random;

/* compiled from: PG */
/* renamed from: kmg  reason: default package */
/* loaded from: classes.dex */
public final class kmg {
    public static final DecelerateInterpolator a = new DecelerateInterpolator();
    public static final Duration b = Duration.ofMillis(300);
    public static final Duration c = Duration.ofMillis(100);
    public final AssistantP6GlowView d;
    public final Random e = new Random();
    public final float[] f = new float[4];
    public final float[] g;
    public final giw h;

    public kmg(AssistantP6GlowView assistantP6GlowView, giw giwVar, byte[] bArr) {
        float[] e;
        oll.e(assistantP6GlowView, "view");
        this.d = assistantP6GlowView;
        this.h = giwVar;
        e = kmj.e(25.0f, 25.0f, new float[]{1.0f, 1.0f, 1.0f, 1.0f});
        this.g = e;
    }
}
