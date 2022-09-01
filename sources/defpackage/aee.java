package defpackage;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: aee  reason: default package */
/* loaded from: classes.dex */
public final class aee extends SpannableStringBuilder {
    private final Class a;
    private final List b = new ArrayList();

    public aee(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.a = cls;
    }

    private final aed c(Object obj) {
        for (int i = 0; i < this.b.size(); i++) {
            aed aedVar = (aed) this.b.get(i);
            if (aedVar.a == obj) {
                return aedVar;
            }
        }
        return null;
    }

    private final void d() {
        for (int i = 0; i < this.b.size(); i++) {
            ((aed) this.b.get(i)).b.decrementAndGet();
        }
    }

    private final boolean e(Class cls) {
        return this.a == cls;
    }

    private final boolean f(Object obj) {
        return obj != null && e(obj.getClass());
    }

    public final void a() {
        for (int i = 0; i < this.b.size(); i++) {
            ((aed) this.b.get(i)).b.incrementAndGet();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* synthetic */ Editable append(char c) {
        super.append(c);
        return this;
    }

    public final void b() {
        d();
        for (int i = 0; i < this.b.size(); i++) {
            ((aed) this.b.get(i)).onTextChanged(this, 0, length(), length());
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* synthetic */ Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        aed c;
        if (f(obj) && (c = c(obj)) != null) {
            obj = c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        aed c;
        if (f(obj) && (c = c(obj)) != null) {
            obj = c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        aed c;
        if (f(obj) && (c = c(obj)) != null) {
            obj = c;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (e(cls)) {
            aed[] aedVarArr = (aed[]) super.getSpans(i, i2, aed.class);
            Object[] objArr = (Object[]) Array.newInstance(cls, aedVarArr.length);
            for (int i3 = 0; i3 < aedVarArr.length; i3++) {
                objArr[i3] = aedVarArr[i3].a;
            }
            return objArr;
        }
        return super.getSpans(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* synthetic */ Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (true == e(cls)) {
            cls = aed.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        aed aedVar;
        if (f(obj)) {
            aedVar = c(obj);
            if (aedVar != null) {
                obj = aedVar;
            }
        } else {
            aedVar = null;
        }
        super.removeSpan(obj);
        if (aedVar != null) {
            this.b.remove(aedVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        mo9replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (f(obj)) {
            aed aedVar = new aed(obj);
            this.b.add(aedVar);
            obj = aedVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new aee(this.a, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder mo0append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    /* renamed from: delete  reason: collision with other method in class */
    public final SpannableStringBuilder mo6delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder mo7insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    /* renamed from: replace  reason: collision with other method in class */
    public final SpannableStringBuilder mo9replace(int i, int i2, CharSequence charSequence) {
        a();
        super.replace(i, i2, charSequence);
        d();
        return this;
    }

    public aee(Class cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        nq.h(cls, "watcherClass cannot be null");
        this.a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    /* renamed from: append  reason: collision with other method in class */
    public final /* synthetic */ Appendable mo3append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* synthetic */ Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* synthetic */ Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder mo8insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder mo1append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        mo10replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    /* renamed from: append  reason: collision with other method in class */
    public final /* synthetic */ Appendable mo4append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    /* renamed from: replace  reason: collision with other method in class */
    public final SpannableStringBuilder mo10replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        a();
        super.replace(i, i2, charSequence, i3, i4);
        d();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* synthetic */ Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder mo2append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    /* renamed from: append  reason: collision with other method in class */
    public final /* synthetic */ Appendable mo5append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
