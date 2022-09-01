package defpackage;

/* compiled from: PG */
/* renamed from: drd  reason: default package */
/* loaded from: classes.dex */
public enum drd {
    TWELVE_KEY_TOGGLE_KANA(new krm("TWELVE_KEY_TOGGLE_KANA", 1), false, 2, 11, 1, true, 1, false, true, null, null, null),
    TWELVE_KEY_TOGGLE_ALPHABET(new krm("TWELVE_KEY_TOGGLE_ALPHABET", 1), false, 4, 12, 3, false, 1, false, true, null, null, null),
    TWELVE_KEY_FLICK_KANA(new krm("TWELVE_KEY_FLICK_KANA", 1), false, 2, 14, 1, true, 1, false, false, null, null, null),
    TWELVE_KEY_FLICK_ALPHABET(new krm("TWELVE_KEY_FLICK_ALPHABET", 1), false, 4, 15, 3, false, 2, false, false, null, null, null),
    TWELVE_KEY_FLICK_NUMBER(new krm("TWELVE_KEY_FLICK_NUMBER", 1), false, 4, 44, 3, false, 2, false, false, null, null, null),
    TWELVE_KEY_TOGGLE_FLICK_KANA(new krm("TWELVE_KEY_TOGGLE_FLICK_KANA", 1), false, 2, 17, 1, true, 1, false, true, null, null, null),
    TWELVE_KEY_TOGGLE_FLICK_ALPHABET(new krm("TWELVE_KEY_TOGGLE_FLICK_ALPHABET", 1), false, 4, 18, 3, false, 1, false, true, null, null, null),
    QWERTY_KANA(new krm("QWERTY_KANA", 1), false, 2, 21, 1, false, 1, false, false, null, null, null),
    QWERTY_ALPHABET(new krm("QWERTY_ALPHABET", 1), false, 4, 23, 3, false, 2, false, false, null, null, null),
    GODAN_KANA(new krm("GODAN_KANA", 1), false, 2, 31, 1, true, 1, false, false, null, null, null),
    SYMBOL_NUMBER(new krm("TWELVE_KEY_SYMBOL_NUMBER", 1), false, 4, 23, 3, false, 1, false, false, null, null, null),
    HARDWARE_QWERTY_KANA(new krm("HARDWARE_QWERTY_KANA", 1), true, 2, 1, 1, false, 1, false, false, null, null, null),
    HARDWARE_QWERTY_ALPHABET(new krm("HARDWARE_QWERTY_ALPHABET", 1), true, 4, 1, 3, false, 1, false, false, null, null, null),
    NOTOUCH_KANA(new krm("NOTOUCH_KANA", 1), false, 2, 41, 1, false, 1, false, false, null, null, null),
    BYPASS(new krm("BYPASS", 0), false, 4, 23, 3, false, 1, true, false, null, null, null),
    FIFTY_KEYS_HIRAGANA(new krm("FIFTY_KEYS_HIRAGANA", 1), false, 2, 47, 1, true, 1, false, false, null, null, null);
    
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final krm y;

    drd(krm krmVar, boolean z2, int i, int i2, int i3, boolean z3, int i4, boolean z4, boolean z5, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.y = krmVar;
        this.q = z2;
        this.u = i;
        this.v = i2;
        this.w = i3;
        this.r = z3;
        this.x = i4;
        this.s = z4;
        this.t = z5;
    }
}
