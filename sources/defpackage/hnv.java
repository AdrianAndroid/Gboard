package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.UnderlineSpan;
import com.google.android.inputmethod.latin.R;
import java.util.List;

/* compiled from: PG */
/* renamed from: hnv  reason: default package */
/* loaded from: classes.dex */
public final class hnv extends gxa {
    final CharacterStyle g;
    final CharacterStyle h;
    final CharacterStyle i = new UnderlineSpan();
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    public hnv(Context context, hls hlsVar) {
        super(context, hlsVar);
        this.g = new BackgroundColorSpan(context.getResources().getColor(R.color.f21000_resource_name_obfuscated_res_0x7f0600a9));
        this.h = new BackgroundColorSpan(context.getResources().getColor(R.color.f21010_resource_name_obfuscated_res_0x7f0600aa));
    }

    private final boolean A() {
        return this.m && ((Boolean) hnu.g.c()).booleanValue() && (!(this.b == 0 || this.c == 0) || ((Boolean) hnu.h.c()).booleanValue());
    }

    private static boolean z() {
        return jam.o() && ((Boolean) hnu.a.c()).booleanValue();
    }

    @Override // defpackage.gxa
    protected final CharSequence k(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence) || ((!z() || !this.j) && !this.l)) {
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(gwc.k(this.a) ? this.h : this.g, 0, charSequence.length(), 512);
        spannableString.setSpan(this.i, 0, charSequence.length(), 256);
        return spannableString;
    }

    @Override // defpackage.gxa
    protected final void m() {
        boolean z = false;
        if (this.k && z()) {
            z = true;
        }
        this.j = z;
        this.l = A();
    }

    @Override // defpackage.gxa
    protected final void q() {
        this.l = false;
    }

    @Override // defpackage.gxa
    protected final void s(List list, hln hlnVar) {
        Long l;
        this.k = false;
        this.m = false;
        if (list == null || list.isEmpty()) {
            t(0L);
        } else if (hlnVar == null || !hlnVar.g) {
            if (((hln) list.get(0)).s == 10) {
                this.m = true;
                t(0L);
                return;
            }
            t(0L);
        } else {
            this.k = true;
            if (hlnVar.s == 8) {
                l = (Long) hnu.d.c();
            } else {
                l = (Long) hnu.c.c();
            }
            t(l.longValue());
        }
    }

    @Override // defpackage.gxa
    protected final boolean w() {
        return (this.j == (this.k && z()) && this.l == A()) ? false : true;
    }
}
