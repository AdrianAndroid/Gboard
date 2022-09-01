package defpackage;

/* compiled from: PG */
/* renamed from: hxo  reason: default package */
/* loaded from: classes.dex */
public enum hxo implements ido {
    GLOBE_KEY_IGNORED("KeyThrottler.Globe.Ignored"),
    EMOJI_KEY_IGNORED("KeyThrottler.Emoji.Ignored"),
    EMOJI_KEY_TAPS_DURING_THROTTLING("KeyThrottler.Emoji.TapsInThrottle"),
    GLOBE_KEY_TAPS_DURING_THROTTLING("KeyThrottler.Globe.TapsInThrottle");
    
    private final String f;

    hxo(String str) {
        this.f = str;
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return 1000;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.f;
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }
}
