package defpackage;

import android.text.style.SuggestionSpan;

/* compiled from: PG */
/* renamed from: enk  reason: default package */
/* loaded from: classes.dex */
public final class enk {
    public static final enk[] a = new enk[0];
    public final SuggestionSpan b;
    public final int c;
    public int d;

    public enk(SuggestionSpan suggestionSpan, int i, int i2) {
        this.b = suggestionSpan;
        this.c = i;
        this.d = i2;
    }

    public final int a() {
        return this.b.getFlags();
    }

    public final String[] b() {
        return this.b.getSuggestions();
    }
}
