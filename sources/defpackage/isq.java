package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.SuggestionSpan;
import android.view.inputmethod.TextAttribute;
import j$.util.Collection$EL;
import java.util.List;

/* compiled from: PG */
/* renamed from: isq  reason: default package */
/* loaded from: classes.dex */
public final class isq extends gxa {
    public static final hhl g = hhq.a("enable_text_conversion", false);
    public boolean h;
    public boolean i;
    private SuggestionSpan j;
    private SuggestionSpan k;
    private boolean l;
    private Runnable m;

    public isq(Context context, hls hlsVar) {
        super(context, hlsVar);
    }

    @Override // defpackage.gxa
    protected final CharSequence k(CharSequence charSequence) {
        SuggestionSpan suggestionSpan;
        if (!this.h || (suggestionSpan = this.j) == null || charSequence == null) {
            return charSequence;
        }
        String[] suggestions = suggestionSpan.getSuggestions();
        if (suggestions == null || !this.i || !li.f()) {
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(this.j, 0, charSequence.length(), 17);
            return spannableString;
        }
        this.e = new TextAttribute.Builder().setTextConversionSuggestions(llp.p(suggestions)).build();
        return charSequence;
    }

    @Override // defpackage.gxa
    protected final void m() {
        this.k = this.j;
    }

    @Override // defpackage.gxa
    protected final void q() {
        this.k = null;
    }

    @Override // defpackage.gxa
    protected final void r() {
        this.l = false;
    }

    @Override // defpackage.gxa
    protected final void s(List list, hln hlnVar) {
        if (this.h && !this.l) {
            if (list != null && !list.isEmpty()) {
                int max = hlnVar != null ? Math.max(0, list.indexOf(hlnVar)) : 0;
                this.j = new SuggestionSpan(this.a, (String[]) Collection$EL.stream(list.subList(max, Math.min(list.size(), max + 5))).map(eoe.k).toArray(isp.a), 0);
            } else {
                this.j = null;
            }
            t(0L);
            this.l = true;
        }
    }

    @Override // defpackage.gxa
    public final void u() {
        super.u();
        Runnable runnable = this.m;
        if (runnable != null) {
            kki.k(runnable);
            this.m = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gxa
    public final void v(CharSequence charSequence, int i) {
        if (!this.h) {
            super.v(charSequence, i);
        }
        Runnable runnable = this.m;
        if (runnable != null) {
            kki.k(runnable);
        }
        ov ovVar = new ov(this, charSequence, i, 12);
        this.m = ovVar;
        kki.j(ovVar);
    }

    @Override // defpackage.gxa
    protected final boolean w() {
        return this.h && this.j != this.k;
    }

    public final /* synthetic */ void z(CharSequence charSequence, int i) {
        super.v(charSequence, i);
        this.m = null;
    }
}
