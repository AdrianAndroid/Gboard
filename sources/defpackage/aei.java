package defpackage;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: aei  reason: default package */
/* loaded from: classes.dex */
public final class aei extends SpannableStringBuilder {
    private final Class a;
    private final List b = new ArrayList();

    public aei(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.a = cls;
    }

    private final aeh a(Object obj) {
        for (int i = 0; i < this.b.size(); i++) {
            aeh aehVar = (aeh) this.b.get(i);
            if (aehVar.a == obj) {
                return aehVar;
            }
        }
        return null;
    }

    private final void b() {
        for (int i = 0; i < this.b.size(); i++) {
            ((aeh) this.b.get(i)).b.incrementAndGet();
        }
    }

    private final void c() {
        for (int i = 0; i < this.b.size(); i++) {
            ((aeh) this.b.get(i)).b.decrementAndGet();
        }
    }

    private final boolean d(Class cls) {
        return this.a == cls;
    }

    private final boolean e(Object obj) {
        return obj != null && d(obj.getClass());
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* synthetic */ Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* synthetic */ Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        aeh a;
        if (e(obj) && (a = a(obj)) != null) {
            obj = a;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        aeh a;
        if (e(obj) && (a = a(obj)) != null) {
            obj = a;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        aeh a;
        if (e(obj) && (a = a(obj)) != null) {
            obj = a;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (d(cls)) {
            aeh[] aehVarArr = (aeh[]) super.getSpans(i, i2, aeh.class);
            Object[] objArr = (Object[]) Array.newInstance(cls, aehVarArr.length);
            for (int i3 = 0; i3 < aehVarArr.length; i3++) {
                objArr[i3] = aehVarArr[i3].a;
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
        if (cls == null || d(cls)) {
            cls = aeh.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        aeh aehVar;
        if (e(obj)) {
            aehVar = a(obj);
            if (aehVar != null) {
                obj = aehVar;
            }
        } else {
            aehVar = null;
        }
        super.removeSpan(obj);
        if (aehVar != null) {
            this.b.remove(aehVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        mo20replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (e(obj)) {
            aeh aehVar = new aeh(obj);
            this.b.add(aehVar);
            obj = aehVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new aei(this.a, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder mo11append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    /* renamed from: delete  reason: collision with other method in class */
    public final SpannableStringBuilder mo17delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder mo18insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    /* renamed from: replace  reason: collision with other method in class */
    public final SpannableStringBuilder mo20replace(int i, int i2, CharSequence charSequence) {
        b();
        super.replace(i, i2, charSequence);
        c();
        return this;
    }

    public aei(Class cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        nq.h(cls, "watcherClass cannot be null");
        this.a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    /* renamed from: append  reason: collision with other method in class */
    public final /* synthetic */ Appendable mo14append(char c) {
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
    public final SpannableStringBuilder mo19insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder mo12append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        mo21replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    /* renamed from: append  reason: collision with other method in class */
    public final /* synthetic */ Appendable mo15append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    /* renamed from: replace  reason: collision with other method in class */
    public final SpannableStringBuilder mo21replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        b();
        super.replace(i, i2, charSequence, i3, i4);
        c();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* synthetic */ Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder mo13append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    /* renamed from: append  reason: collision with other method in class */
    public final /* synthetic */ Appendable mo16append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
