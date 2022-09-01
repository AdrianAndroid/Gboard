package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import com.google.android.inputmethod.latin.R;
import java.util.List;

/* compiled from: PG */
/* renamed from: btw  reason: default package */
/* loaded from: classes.dex */
public class btw extends did {
    protected static final CharacterStyle a = new UnderlineSpan();
    protected SpannableStringBuilder b;
    private final CharacterStyle h;
    private final CharacterStyle i;
    private final CharacterStyle j;
    private CharacterStyle k;
    private int l;
    private int m;
    private boolean n;
    private final boolean t;
    private djd v;
    private final CharacterStyle g = new UnderlineSpan();
    private int o = 26;
    private int p = 26;
    private boolean q = false;
    private int r = -1;
    public int c = -1;
    private djj s = djj.SOURCE_INPUT_UNIT;
    private final List u = lre.F();

    public btw(Context context, boolean z) {
        Resources resources = context.getResources();
        this.i = new BackgroundColorSpan(resources.getColor(R.color.f26900_resource_name_obfuscated_res_0x7f060511));
        this.j = new BackgroundColorSpan(resources.getColor(R.color.f26910_resource_name_obfuscated_res_0x7f060512));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.f3050_resource_name_obfuscated_res_0x7f040061});
        this.h = new ForegroundColorSpan(obtainStyledAttributes.getColor(0, resources.getColor(R.color.f26870_resource_name_obfuscated_res_0x7f06050e)));
        obtainStyledAttributes.recycle();
        this.t = z;
        d();
    }

    private final boolean h() {
        return this.c == 0;
    }

    private final boolean l() {
        return this.r == 0;
    }

    @Override // defpackage.djf
    public CharSequence a() {
        if (this.t) {
            SpannableStringBuilder spannableStringBuilder = this.b;
            spannableStringBuilder.setSpan(a, 0, spannableStringBuilder.length(), 256);
        }
        return this.b;
    }

    protected String b() {
        return " ";
    }

    @Override // defpackage.djf
    public void c(dje djeVar) {
        if (this.c == 0) {
            this.u.add(djeVar.clone());
            int size = this.u.size();
            djd djdVar = this.v;
            if (size != djdVar.a) {
                return;
            }
            this.b.append((CharSequence) btu.a(j((String) djdVar.e), this.u));
            this.u.clear();
            return;
        }
        int length = this.b.length();
        if (this.q) {
            if (e(this.o, l(), djeVar.d, h(), this.s, djeVar.h)) {
                this.b.append((CharSequence) b());
            }
            this.o = djeVar.d;
            this.q = false;
        } else if (f(this.p, djeVar.d, this.s, djeVar.h)) {
            this.b.append((CharSequence) " ");
        }
        this.p = djeVar.d;
        this.s = djeVar.h;
        this.n = true;
        int length2 = this.b.length();
        if (djeVar.f) {
            if (this.k == null || this.m != 1) {
                this.k = CharacterStyle.wrap(this.i);
                this.l = length;
                this.m = 1;
            }
        } else if (!djeVar.e) {
            if (this.k == null || this.m != 2) {
                this.k = CharacterStyle.wrap(this.h);
                this.l = length2;
                this.m = 2;
            }
        } else if (djeVar.h == djj.SOURCE_TOKEN) {
            if (this.k == null || this.m != 3) {
                this.k = CharacterStyle.wrap(this.g);
                this.l = length2;
                this.m = 3;
            }
        } else if (this.k != null) {
            this.k = null;
            this.m = 0;
        }
        this.b.append((CharSequence) k(djeVar.f ? djeVar.a : djeVar.b));
        CharacterStyle characterStyle = this.k;
        if (characterStyle == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = this.b;
        spannableStringBuilder.setSpan(characterStyle, this.l, spannableStringBuilder.length(), 256);
    }

    @Override // defpackage.djf
    public void d() {
        this.b = new SpannableStringBuilder();
        this.k = null;
        this.l = 0;
        this.m = 0;
        this.n = false;
        this.o = 26;
        this.p = 26;
        this.s = djj.SOURCE_INPUT_UNIT;
        this.q = false;
        this.r = -1;
        this.c = -1;
    }

    protected boolean e(int i, boolean z, int i2, boolean z2, djj djjVar, djj djjVar2) {
        if (i == 0) {
            if (i2 == 0) {
                return true;
            }
            i = 0;
        }
        if (djjVar == djj.TARGET_TOKEN && djjVar2 == djj.TARGET_TOKEN) {
            return false;
        }
        if (i != 26 && !z && !z2) {
            return true;
        }
        return i == 0 && i2 != 0 && z && !z2;
    }

    protected boolean f(int i, int i2, djj djjVar, djj djjVar2) {
        return !(i == 0 && i2 == 0) && !(djjVar == djj.TARGET_TOKEN && djjVar2 == djj.TARGET_TOKEN);
    }

    @Override // defpackage.djf
    public final void g() {
        if (this.n) {
            this.b.append((CharSequence) "'");
            CharacterStyle characterStyle = this.k;
            if (characterStyle == null) {
                return;
            }
            SpannableStringBuilder spannableStringBuilder = this.b;
            spannableStringBuilder.setSpan(characterStyle, this.l, spannableStringBuilder.length(), 256);
        }
    }

    @Override // defpackage.djf
    public final int m(int i, boolean z) {
        int i2 = this.c;
        this.r = i2;
        this.c = i;
        if (i2 != i) {
            this.k = null;
        }
        if (i != 0) {
            if (i != 1) {
                return 4;
            }
            this.q = true;
            return 2;
        }
        return 3;
    }

    @Override // defpackage.djf
    public final void n(djc djcVar) {
        int length = this.b.length();
        this.b.append((CharSequence) i((String) djcVar.b));
        this.n = true;
        if (this.k == null) {
            this.k = CharacterStyle.wrap(this.j);
            this.l = length;
        }
        SpannableStringBuilder spannableStringBuilder = this.b;
        spannableStringBuilder.setSpan(this.k, this.l, spannableStringBuilder.length(), 256);
    }

    @Override // defpackage.djf
    public final void o(djd djdVar) {
        this.n = false;
        if (e(this.o, l(), djdVar.b, h(), this.s, djj.TARGET_TOKEN)) {
            this.b.append((CharSequence) b());
        }
        this.o = djdVar.c;
        this.s = djj.TARGET_TOKEN;
        this.v = djdVar;
    }
}
