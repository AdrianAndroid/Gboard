package defpackage;

/* compiled from: PG */
/* renamed from: hxr  reason: default package */
/* loaded from: classes.dex */
public enum hxr implements ids {
    EMOJI_TAPPED_SINCE_LAST_NORMAL_KEY("KeyThrottler.Emoji.SinceLastNormal"),
    EMOJI_TAPPED_SINCE_LAST_EMOJI_KEY("KeyThrottler.Emoji.SinceLastEmoji"),
    GLOBE_TAPPED_SINCE_LAST_NORMAL_KEY("KeyThrottler.Globe.SinceLastNormal"),
    GLOBE_TAPPED_SINCE_LAST_GLOBE_KEY("KeyThrottler.Globe.SinceLastGlobe");
    
    private final String f;
    private final int g = 1000;

    hxr(String str) {
        this.f = str;
    }

    @Override // defpackage.idt
    public final int a() {
        return this.g;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.f;
    }
}
