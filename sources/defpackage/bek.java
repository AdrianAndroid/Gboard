package defpackage;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: bek  reason: default package */
/* loaded from: classes.dex */
public final class bek {
    public final Object a;
    public final Object b;

    public bek(TextView textView) {
        this.a = textView;
        this.b = new aqr(textView);
    }

    public bek(axp axpVar, axn axnVar) {
        this.a = axpVar;
        this.b = axnVar;
    }

    public bek(bhc bhcVar, ado adoVar, byte[] bArr, byte[] bArr2) {
        this.a = bhcVar;
        this.b = adoVar;
    }

    public bek(Class cls, auo auoVar) {
        this.a = cls;
        this.b = auoVar;
    }

    public bek(Class cls, avd avdVar) {
        this.a = cls;
        this.b = avdVar;
    }

    public bek(List list, axn axnVar) {
        this.a = list;
        this.b = axnVar;
    }

    public bek(pe peVar, pi piVar) {
        this.b = peVar;
        this.a = piVar;
    }

    public bek(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = new qv();
        this.a = new qs();
    }

    public bek(char[] cArr) {
    }

    private static boolean A(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    public static final axh h(ImageDecoder.Source source, int i, int i2, ava avaVar) {
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source, new bai(i, i2, avaVar));
        if (!(decodeDrawable instanceof AnimatedImageDrawable)) {
            throw new IOException("Received unexpected drawable type for animated webp, failing: ".concat(String.valueOf(String.valueOf(decodeDrawable))));
        }
        return new bcc((AnimatedImageDrawable) decodeDrawable, 2);
    }

    public static final boolean i(ImageHeaderParser$ImageType imageHeaderParser$ImageType) {
        return imageHeaderParser$ImageType == ImageHeaderParser$ImageType.ANIMATED_WEBP;
    }

    public static boolean j(Editable editable, KeyEvent keyEvent, boolean z) {
        adt[] adtVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (!A(selectionStart, selectionEnd) && (adtVarArr = (adt[]) editable.getSpans(selectionStart, selectionEnd, adt.class)) != null && (r2 = adtVarArr.length) > 0) {
                for (adt adtVar : adtVarArr) {
                    int spanStart = editable.getSpanStart(adtVar);
                    int spanEnd = editable.getSpanEnd(adtVar);
                    if (z) {
                        if (spanStart == selectionStart) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                        if (selectionStart <= spanStart && selectionStart < spanEnd) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                    } else {
                        if (spanEnd == selectionStart) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                        if (selectionStart <= spanStart) {
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0042, code lost:
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x007d, code lost:
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0070, code lost:
        if (r11 != false) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean k(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bek.k(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public static final void m(Spannable spannable, adr adrVar, int i, int i2) {
        spannable.setSpan(new adt(adrVar), i, i2, 33);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    private final synchronized List z(String str) {
        if (!this.b.contains(str)) {
            this.b.add(str);
        }
        List list = (List) this.a.get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.a.put(str, arrayList);
            return arrayList;
        }
        return list;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map, java.lang.Object] */
    public final synchronized List a(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.b) {
            List<dsl> list = (List) this.a.get(str);
            if (list != null) {
                for (dsl dslVar : list) {
                    if (dslVar.c(cls, cls2)) {
                        arrayList.add(dslVar.c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map, java.lang.Object] */
    public final synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.b) {
            List<dsl> list = (List) this.a.get(str);
            if (list != null) {
                for (dsl dslVar : list) {
                    if (dslVar.c(cls, cls2) && !arrayList.contains(dslVar.a)) {
                        arrayList.add(dslVar.a);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized void c(String str, avc avcVar, Class cls, Class cls2) {
        z(str).add(new dsl(cls, cls2, avcVar));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.lang.Object] */
    public final synchronized void d(List list) {
        ArrayList arrayList = new ArrayList((Collection) this.b);
        this.b.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.b.add((String) it.next());
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (!list.contains(str)) {
                this.b.add(str);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [axp, java.lang.Object] */
    public final void e(Bitmap bitmap) {
        this.a.d(bitmap);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [axn, java.lang.Object] */
    public final void f(byte[] bArr) {
        ?? r0 = this.b;
        if (r0 == 0) {
            return;
        }
        r0.c(bArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [axn, java.lang.Object] */
    public final byte[] g(int i) {
        ?? r0 = this.b;
        return r0 == 0 ? new byte[i] : (byte[]) r0.a(i, byte[].class);
    }

    public final boolean l(CharSequence charSequence, int i, int i2, adr adrVar) {
        if (adrVar.b == 0) {
            Object obj = this.b;
            ajj e = adrVar.e();
            int a = e.a(8);
            if (a != 0) {
                e.b.getShort(a + e.a);
            }
            if (ads.a.get() == null) {
                ads.a.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) ads.a.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            adrVar.b = true != vs.a(((ads) obj).b, sb.toString()) ? 1 : 2;
        }
        return adrVar.b == 2;
    }

    public final void n(Runnable runnable) {
        ((Choreographer) this.a).postFrameCallback(new cgh(runnable, 1));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Runnable] */
    public final void o() {
        Iterator descendingIterator = ((ArrayDeque) this.a).descendingIterator();
        while (descendingIterator.hasNext()) {
            oy oyVar = (oy) descendingIterator.next();
            if (oyVar.a) {
                bi biVar = oyVar.c;
                biVar.aa(true);
                if (biVar.d.a) {
                    biVar.V();
                    return;
                } else {
                    biVar.u.o();
                    return;
                }
            }
        }
        ?? r0 = this.b;
        if (r0 != 0) {
            r0.run();
        }
    }

    public final void p(mo moVar) {
        oh ohVar = (oh) ((qv) this.b).get(moVar);
        if (ohVar == null) {
            ohVar = oh.a();
            ((qv) this.b).put(moVar, ohVar);
        }
        ohVar.b |= 1;
    }

    public final void q(long j, mo moVar) {
        ((qs) this.a).j(j, moVar);
    }

    public final void r() {
        ((qv) this.b).clear();
        ((qs) this.a).h();
    }

    public final void s(mo moVar) {
        oh ohVar = (oh) ((qv) this.b).get(moVar);
        if (ohVar == null) {
            return;
        }
        ohVar.b &= -2;
    }

    public final void t(mo moVar) {
        int a = ((qs) this.a).a();
        while (true) {
            a--;
            if (a < 0) {
                break;
            } else if (moVar == ((qs) this.a).f(a)) {
                qs qsVar = (qs) this.a;
                Object[] objArr = qsVar.c;
                Object obj = objArr[a];
                Object obj2 = qt.a;
                if (obj != obj2) {
                    objArr[a] = obj2;
                    qsVar.a = true;
                }
            }
        }
        oh ohVar = (oh) ((qv) this.b).remove(moVar);
        if (ohVar != null) {
            oh.b(ohVar);
        }
    }

    public final boolean u(mo moVar) {
        oh ohVar = (oh) ((qv) this.b).get(moVar);
        return (ohVar == null || (ohVar.b & 1) == 0) ? false : true;
    }

    public final void v(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = ((TextView) this.a).getContext().obtainStyledAttributes(attributeSet, ei.i, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            Object obj = ((aqr) this.b).a;
            aen.b();
            ((aen) obj).a.a = z;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final yx w(mo moVar, int i) {
        oh ohVar;
        yx yxVar;
        int b = ((qv) this.b).b(moVar);
        if (b >= 0 && (ohVar = (oh) ((qv) this.b).f(b)) != null) {
            int i2 = ohVar.b;
            if ((i2 & i) != 0) {
                int i3 = (i ^ (-1)) & i2;
                ohVar.b = i3;
                if (i == 4) {
                    yxVar = ohVar.c;
                } else if (i == 8) {
                    yxVar = ohVar.d;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    ((qv) this.b).d(b);
                    oh.b(ohVar);
                }
                return yxVar;
            }
        }
        return null;
    }

    public final void x(mo moVar, yx yxVar) {
        oh ohVar = (oh) ((qv) this.b).get(moVar);
        if (ohVar == null) {
            ohVar = oh.a();
            ((qv) this.b).put(moVar, ohVar);
        }
        ohVar.d = yxVar;
        ohVar.b |= 8;
    }

    public final void y(mo moVar, yx yxVar) {
        oh ohVar = (oh) ((qv) this.b).get(moVar);
        if (ohVar == null) {
            ohVar = oh.a();
            ((qv) this.b).put(moVar, ohVar);
        }
        ohVar.c = yxVar;
        ohVar.b |= 4;
    }

    public bek(Runnable runnable) {
        this.a = new ArrayDeque();
        this.b = runnable;
    }

    public bek(byte[] bArr, byte[] bArr2) {
        this.a = Choreographer.getInstance();
        this.b = Looper.myLooper();
    }

    public bek(EditText editText, byte[] bArr) {
        this((char[]) null);
        this.b = editText;
        aec aecVar = new aec(editText);
        this.a = aecVar;
        editText.addTextChangedListener(aecVar);
        editText.setEditableFactory(ady.a());
    }

    public bek(EditText editText) {
        this((char[]) null);
        this.b = editText;
        aeo aeoVar = new aeo(editText);
        this.a = aeoVar;
        editText.addTextChangedListener(aeoVar);
        editText.setEditableFactory(aej.a());
    }

    public bek(byte[] bArr) {
        this.a = new AtomicReference();
        this.b = new qo();
    }

    public bek() {
        this.b = new ArrayList();
        this.a = new HashMap();
    }
}
