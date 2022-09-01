package defpackage;

import android.content.Context;
import android.service.textservice.SpellCheckerService;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.SuggestionSpan;
import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* renamed from: enj  reason: default package */
/* loaded from: classes.dex */
public final class enj extends SpellCheckerService.Session {
    private final emx h;
    private eno i;
    private final idk j;
    private final Context k;
    private final jaq l;
    private final cdn m;
    private final enn n;
    private final eoh t;
    private final asl u;
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/spellchecker/SpellCheckerSession");
    private static final String[] c = gvw.g;
    private static final SentenceSuggestionsInfo[] d = new SentenceSuggestionsInfo[0];
    private static final int e = 8;
    private static final int f = 16;
    protected static final int a = 8;
    private end g = null;
    private boolean o = true;
    private int p = 0;
    private final List q = new ArrayList();
    private final List r = new ArrayList();
    private final enc s = new enc(this);

    static {
        li.e();
        li.e();
        li.e();
    }

    public enj(asl aslVar, emx emxVar, cdn cdnVar, enn ennVar, idk idkVar, Context context) {
        this.u = aslVar;
        this.h = emxVar;
        this.m = cdnVar;
        this.n = ennVar;
        this.j = idkVar;
        this.k = context;
        this.l = new jaq(context);
        this.t = eoh.b(context);
    }

    private final int c() {
        return d() | 2;
    }

    private final int d() {
        if (this.o) {
            if (kez.u(this.k)) {
                this.p = f;
            } else {
                this.p = 0;
            }
            this.o = false;
        }
        return this.p;
    }

    private static SuggestionsInfo e(int i) {
        return new SuggestionsInfo(i, c);
    }

    private final String f() {
        try {
            return super.getLocale();
        } catch (NullPointerException unused) {
            return null;
        }
    }

    private static List g(eno enoVar, CharSequence charSequence, boolean z) {
        int i;
        boolean z2;
        BreakIterator sentenceInstance = BreakIterator.getSentenceInstance();
        sentenceInstance.setText(charSequence.toString());
        int first = sentenceInstance.first();
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i2 = first;
            first = sentenceInstance.next();
            if (first != -1) {
                CharSequence subSequence = charSequence.subSequence(i2, first);
                if (i2 == 0) {
                    z2 = z;
                    i = 0;
                } else {
                    i = i2;
                    z2 = false;
                }
                llp b2 = enoVar.b(subSequence, z2);
                int size = b2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    obc a2 = oth.a();
                    a2.m((oth) b2.get(i3));
                    a2.g(i);
                    arrayList.add(a2.l());
                }
            } else {
                return arrayList;
            }
        }
    }

    private final void h(TextInfo[] textInfoArr, SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        Spanned spanned;
        SuggestionSpan[] suggestionSpanArr;
        TextInfo[] textInfoArr2 = textInfoArr;
        SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr2 = sentenceSuggestionsInfoArr;
        if (kez.u(this.k)) {
            nfh t = mee.d.t();
            int i = 0;
            if (textInfoArr2.length == sentenceSuggestionsInfoArr2.length) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mee meeVar = (mee) t.b;
                meeVar.a |= 1;
                meeVar.b = true;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (i2 < textInfoArr2.length) {
                    if (textInfoArr2[i2].getCharSequence() instanceof Spanned) {
                        lsw lswVar = new lsw();
                        Spanned spanned2 = (Spanned) textInfoArr2[i2].getCharSequence();
                        SuggestionSpan[] suggestionSpanArr2 = (SuggestionSpan[]) spanned2.getSpans(i, spanned2.length(), SuggestionSpan.class);
                        int length = suggestionSpanArr2.length;
                        while (i < length) {
                            SuggestionSpan suggestionSpan = suggestionSpanArr2[i];
                            int flags = suggestionSpan.getFlags();
                            int i7 = a;
                            if ((flags & (i7 | 2)) != 0) {
                                int flags2 = suggestionSpan.getFlags() & (i7 | 2);
                                int spanStart = spanned2.getSpanStart(suggestionSpan);
                                suggestionSpanArr = suggestionSpanArr2;
                                lrh f2 = lrh.f(Integer.valueOf(spanned2.getSpanStart(suggestionSpan)), Integer.valueOf(spanned2.getSpanEnd(suggestionSpan)));
                                eni eniVar = new eni(spanStart, flags2);
                                if (!f2.q()) {
                                    lswVar.a(f2);
                                    spanned = spanned2;
                                    lswVar.a.put(f2.b, new lsp(f2, eniVar));
                                } else {
                                    spanned = spanned2;
                                }
                            } else {
                                spanned = spanned2;
                                suggestionSpanArr = suggestionSpanArr2;
                            }
                            i++;
                            spanned2 = spanned;
                            suggestionSpanArr2 = suggestionSpanArr;
                        }
                        HashSet hashSet = new HashSet();
                        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr2[i2];
                        int i8 = 0;
                        while (i8 < sentenceSuggestionsInfo.getSuggestionsCount()) {
                            int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i8);
                            int lengthAt = sentenceSuggestionsInfo.getLengthAt(i8) + offsetAt;
                            int suggestionsAttributes = sentenceSuggestionsInfo.getSuggestionsInfoAt(i8).getSuggestionsAttributes();
                            int i9 = e;
                            int i10 = ((suggestionsAttributes & i9) != 0 ? a : 0) | ((suggestionsAttributes & 2) != 0 ? 2 : 0);
                            SentenceSuggestionsInfo sentenceSuggestionsInfo2 = sentenceSuggestionsInfo;
                            int i11 = i4;
                            lrh f3 = lrh.f(Integer.valueOf(offsetAt), Integer.valueOf(lengthAt));
                            lri lsvVar = f3.equals(lrh.a) ? lswVar : new lsv(lswVar, f3);
                            boolean z = ((i9 | 2) & suggestionsAttributes) != 0;
                            Iterator it = lsvVar.b().entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                lrh lrhVar = (lrh) entry.getKey();
                                eni eniVar2 = (eni) entry.getValue();
                                Iterator it2 = it;
                                int i12 = eniVar2.b;
                                int i13 = eniVar2.a;
                                lsw lswVar2 = lswVar;
                                if (((Integer) lrhVar.j()).intValue() == offsetAt && ((Integer) lrhVar.k()).intValue() == lengthAt && i12 == i10) {
                                    it = it2;
                                    lswVar = lswVar2;
                                    z = false;
                                } else {
                                    if (hashSet.add(Integer.valueOf(i13))) {
                                        if ((i12 & 2) != 0) {
                                            i6++;
                                        } else {
                                            i11++;
                                        }
                                    }
                                    it = it2;
                                    lswVar = lswVar2;
                                }
                            }
                            lsw lswVar3 = lswVar;
                            if (z) {
                                if ((e & suggestionsAttributes) != 0) {
                                    i5++;
                                } else {
                                    i3++;
                                }
                            }
                            i8++;
                            sentenceSuggestionsInfo = sentenceSuggestionsInfo2;
                            i4 = i11;
                            lswVar = lswVar3;
                        }
                    }
                    i2++;
                    textInfoArr2 = textInfoArr;
                    sentenceSuggestionsInfoArr2 = sentenceSuggestionsInfoArr;
                    i = 0;
                }
                if (i3 > 0) {
                    t.dm(o(meb.SPELL_CORRECTION, 2, i3));
                }
                if (i5 > 0) {
                    t.dm(o(meb.GRAMMAR_CORRECTION, 2, i5));
                }
                if (i6 > 0) {
                    t.dm(o(meb.SPELL_CORRECTION, 3, i6));
                }
                if (i4 > 0) {
                    t.dm(o(meb.GRAMMAR_CORRECTION, 3, i4));
                }
                this.j.e(iqu.SC_SUGGESTION_PROPOSED, t.cz());
                return;
            }
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mee meeVar2 = (mee) t.b;
            meeVar2.a |= 1;
            meeVar2.b = false;
            this.j.e(iqu.SC_SUGGESTION_PROPOSED, t.cz());
        }
    }

    private final void i(boolean z) {
        if (hsx.d()) {
            this.j.e(iqu.SC_SPELLING_CHECK_REQUEST_GBOARD, Boolean.valueOf(z));
        } else {
            this.j.e(iqu.SC_SPELLING_CHECK_REQUEST_THIRD_PARTY, Boolean.valueOf(z));
        }
    }

    private final void j() {
        eno enoVar = this.i;
        if (enoVar != null) {
            enoVar.close();
        }
        this.i = null;
    }

    private static boolean k(SuggestionsInfo suggestionsInfo) {
        return (suggestionsInfo.getSuggestionsAttributes() & 2) != 0 && suggestionsInfo.getSuggestionsCount() > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (r3 <= 370) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean l(android.view.textservice.TextInfo[] r6) {
        /*
            r5 = this;
            hhl r0 = defpackage.eng.p
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto L36
            android.view.inputmethod.EditorInfo r0 = defpackage.kez.n()
            boolean r0 = defpackage.kez.q(r0)
            if (r0 != 0) goto L35
            int r0 = r6.length
            r2 = 0
            r3 = 0
        L1c:
            if (r2 >= r0) goto L30
            r4 = r6[r2]
            if (r4 == 0) goto L2d
            java.lang.CharSequence r4 = r4.getCharSequence()
            if (r4 == 0) goto L2d
            int r4 = r4.length()
            int r3 = r3 + r4
        L2d:
            int r2 = r2 + 1
            goto L1c
        L30:
            r6 = 370(0x172, float:5.18E-43)
            if (r3 > r6) goto L35
            goto L36
        L35:
            return r1
        L36:
            hhl r6 = defpackage.enl.a
            java.lang.Object r6 = r6.c()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L55
            android.content.Context r6 = r5.k
            ino r6 = defpackage.ino.M(r6)
            r0 = 2132018805(0x7f140675, float:1.9675927E38)
            boolean r6 = r6.aj(r0)
            if (r6 == 0) goto L55
            r6 = 1
            return r6
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enj.l(android.view.textservice.TextInfo[]):boolean");
    }

    private static SentenceSuggestionsInfo[] m(TextInfo[] textInfoArr, boolean z) {
        int length;
        if (textInfoArr == null || (length = textInfoArr.length) == 0 || !z) {
            return d;
        }
        SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr = new SentenceSuggestionsInfo[length];
        for (int i = 0; i < textInfoArr.length; i++) {
            TextInfo textInfo = textInfoArr[i];
            String text = textInfo.getText();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            BreakIterator wordInstance = BreakIterator.getWordInstance();
            wordInstance.setText(text);
            int first = wordInstance.first();
            for (int next = wordInstance.next(); next != -1; next = wordInstance.next()) {
                if (first != next && !kez.o(text.codePointAt(first))) {
                    arrayList.add(new SuggestionsInfo(1, c, textInfo.getCookie(), textInfo.getSequence()));
                    arrayList2.add(Integer.valueOf(first));
                    arrayList3.add(Integer.valueOf(next - first));
                }
                first = next;
            }
            sentenceSuggestionsInfoArr[i] = new SentenceSuggestionsInfo((SuggestionsInfo[]) arrayList.toArray(new SuggestionsInfo[0]), mhq.p(arrayList2), mhq.p(arrayList3));
        }
        return sentenceSuggestionsInfoArr;
    }

    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.List, java.lang.Object] */
    private final SentenceSuggestionsInfo[] n(TextInfo[] textInfoArr, SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr, eno enoVar) {
        List<oth> g;
        int i;
        if (enoVar == null) {
            return sentenceSuggestionsInfoArr;
        }
        SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr2 = new SentenceSuggestionsInfo[textInfoArr.length];
        int i2 = 0;
        int i3 = 0;
        while (i3 < textInfoArr.length) {
            if (((Boolean) enl.c.c()).booleanValue()) {
                CharSequence charSequence = textInfoArr[i3].getCharSequence();
                boolean z = i3 == 0;
                SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[i3];
                int i4 = 0;
                while (true) {
                    if (i4 < sentenceSuggestionsInfo.getSuggestionsCount()) {
                        if (k(sentenceSuggestionsInfo.getSuggestionsInfoAt(i4))) {
                            HashMap hashMap = new HashMap();
                            StringBuilder sb = new StringBuilder();
                            hashMap.put(Integer.valueOf(sb.length()), Integer.valueOf(i2));
                            int i5 = 0;
                            for (int i6 = 0; i6 < sentenceSuggestionsInfo.getSuggestionsCount(); i6++) {
                                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i6);
                                if (offsetAt > i5) {
                                    sb.append(charSequence, i5, offsetAt);
                                    hashMap.put(Integer.valueOf(sb.length()), Integer.valueOf(offsetAt));
                                    i5 = offsetAt;
                                }
                                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i6);
                                SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i6);
                                if (k(suggestionsInfoAt)) {
                                    sb.append(suggestionsInfoAt.getSuggestionAt(i2));
                                    i5 += lengthAt;
                                    hashMap.put(Integer.valueOf(sb.length()), Integer.valueOf(i5));
                                } else {
                                    int i7 = lengthAt + i5;
                                    sb.append(charSequence, i5, i7);
                                    hashMap.put(Integer.valueOf(sb.length()), Integer.valueOf(i7));
                                    i5 = i7;
                                }
                            }
                            if (i5 < charSequence.length()) {
                                sb.append(charSequence, i5, charSequence.length());
                                hashMap.put(Integer.valueOf(sb.length()), Integer.valueOf(charSequence.length()));
                            }
                            g = g(enoVar, sb, z);
                            for (int i8 = 0; i8 < g.size(); i8++) {
                                oth othVar = (oth) g.get(i8);
                                Integer num = (Integer) hashMap.get(Integer.valueOf(othVar.b));
                                Integer num2 = (Integer) hashMap.get(Integer.valueOf(othVar.a));
                                if (num != null && num2 != null) {
                                    obc a2 = oth.a();
                                    a2.m(othVar);
                                    a2.a = num.intValue();
                                    a2.b = num2.intValue();
                                    g.set(i8, a2.l());
                                }
                            }
                        } else {
                            i4++;
                        }
                    } else {
                        g = g(enoVar, charSequence, z);
                        break;
                    }
                }
            } else {
                g = g(enoVar, textInfoArr[i3].getCharSequence(), i3 == 0);
            }
            if (g.isEmpty()) {
                sentenceSuggestionsInfoArr2[i3] = sentenceSuggestionsInfoArr[i3];
            } else {
                SentenceSuggestionsInfo sentenceSuggestionsInfo2 = sentenceSuggestionsInfoArr[i3];
                TextInfo textInfo = textInfoArr[i3];
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int i9 = 0;
                for (oth othVar2 : g) {
                    while (i9 < sentenceSuggestionsInfo2.getSuggestionsCount() && sentenceSuggestionsInfo2.getOffsetAt(i9) < othVar2.b) {
                        arrayList.add(sentenceSuggestionsInfo2.getSuggestionsInfoAt(i9));
                        arrayList2.add(Integer.valueOf(sentenceSuggestionsInfo2.getOffsetAt(i9)));
                        arrayList3.add(Integer.valueOf(sentenceSuggestionsInfo2.getLengthAt(i9)));
                        i9++;
                    }
                    int i10 = i9;
                    boolean z2 = false;
                    while (true) {
                        i = 2;
                        if (i10 >= sentenceSuggestionsInfo2.getSuggestionsCount() || sentenceSuggestionsInfo2.getOffsetAt(i10) >= othVar2.a) {
                            break;
                        }
                        z2 |= !((sentenceSuggestionsInfo2.getSuggestionsInfoAt(i10).getSuggestionsAttributes() & 2) == 0);
                        i10++;
                    }
                    if (!z2) {
                        if (othVar2.c != null) {
                            int d2 = d();
                            if (li.e()) {
                                i = e;
                            }
                            ?? r15 = othVar2.c;
                            SuggestionsInfo suggestionsInfo = new SuggestionsInfo(d2 | i | 4, (String[]) r15.toArray(new String[r15.size()]));
                            suggestionsInfo.setCookieAndSequence(textInfo.getCookie(), textInfo.getSequence());
                            arrayList.add(suggestionsInfo);
                            arrayList2.add(Integer.valueOf(othVar2.b));
                            arrayList3.add(Integer.valueOf(othVar2.a - othVar2.b));
                        }
                        i9 = i10;
                    } else {
                        while (i9 < i10) {
                            arrayList.add(sentenceSuggestionsInfo2.getSuggestionsInfoAt(i9));
                            arrayList2.add(Integer.valueOf(sentenceSuggestionsInfo2.getOffsetAt(i9)));
                            arrayList3.add(Integer.valueOf(sentenceSuggestionsInfo2.getLengthAt(i9)));
                            i9++;
                        }
                    }
                }
                while (i9 < sentenceSuggestionsInfo2.getSuggestionsCount()) {
                    arrayList.add(sentenceSuggestionsInfo2.getSuggestionsInfoAt(i9));
                    arrayList2.add(Integer.valueOf(sentenceSuggestionsInfo2.getOffsetAt(i9)));
                    arrayList3.add(Integer.valueOf(sentenceSuggestionsInfo2.getLengthAt(i9)));
                    i9++;
                }
                sentenceSuggestionsInfoArr2[i3] = new SentenceSuggestionsInfo((SuggestionsInfo[]) arrayList.toArray(new SuggestionsInfo[arrayList.size()]), mhq.p(arrayList2), mhq.p(arrayList3));
            }
            i3++;
            i2 = 0;
        }
        return sentenceSuggestionsInfoArr2;
    }

    private static mec o(meb mebVar, int i, int i2) {
        nfh t = mec.g.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mec mecVar = (mec) t.b;
        mecVar.c = i - 1;
        int i3 = mecVar.a | 2;
        mecVar.a = i3;
        mecVar.d = mebVar.d;
        int i4 = i3 | 4;
        mecVar.a = i4;
        mecVar.a = i4 | 8;
        mecVar.e = i2;
        return (mec) t.cz();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.textservice.SuggestionsInfo a(java.lang.String r11, java.lang.String[] r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enj.a(java.lang.String, java.lang.String[], int, int):android.view.textservice.SuggestionsInfo");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final defpackage.ewj b() {
        /*
            r7 = this;
            asl r0 = r7.u
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r0 = r7.getLocale()
            java.util.Locale r2 = defpackage.jay.f(r0)
            java.util.Locale r3 = java.util.Locale.ROOT
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L32
            ltg r2 = defpackage.enj.b
            ltv r2 = r2.d()
            ltd r2 = (defpackage.ltd) r2
            r3 = 1064(0x428, float:1.491E-42)
            java.lang.String r4 = "SpellCheckerSession.java"
            java.lang.String r5 = "com/google/android/apps/inputmethod/libs/spellchecker/SpellCheckerSession"
            java.lang.String r6 = "getDecoder"
            ltv r2 = r2.k(r5, r6, r3, r4)
            ltd r2 = (defpackage.ltd) r2
            java.lang.String r3 = "checkSpelling() : Bad locale '%s'"
            r2.w(r3, r0)
            return r1
        L32:
            asl r0 = r7.u
            java.lang.String r3 = r2.getLanguage()
            java.lang.String r4 = "zh"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L50
            java.lang.String r4 = "ja"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L50
            java.lang.String r4 = "ko"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L5d
        L50:
            com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator r2 = com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator.g()
            if (r2 == 0) goto L80
            java.util.Locale r2 = r2.q()
            if (r2 != 0) goto L5d
            goto L80
        L5d:
            ewj r3 = r0.a
            if (r3 == 0) goto L6a
            java.lang.Object r4 = r3.b
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L6a
            goto L81
        L6a:
            com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator r3 = com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator.g()
            if (r3 != 0) goto L71
            goto L80
        L71:
            boolean r4 = r3.K(r2)
            if (r4 == 0) goto L80
            ewj r4 = new ewj
            r4.<init>(r3, r2)
            r0.a = r4
            r3 = r4
            goto L81
        L80:
            r3 = r1
        L81:
            if (r3 != 0) goto L84
            return r1
        L84:
            java.util.List r0 = r7.q
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lae
            java.lang.Object r0 = r3.a
            com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator r0 = (com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator) r0
            java.util.List r0 = r0.n()
            java.util.Iterator r0 = r0.iterator()
        L98:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lae
            java.lang.Object r1 = r0.next()
            java.util.Locale r1 = (java.util.Locale) r1
            java.util.List r2 = r7.q
            java.lang.String r1 = r1.getLanguage()
            r2.add(r1)
            goto L98
        Lae:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enj.b():ewj");
    }

    @Override // android.service.textservice.SpellCheckerService.Session
    public final String getLocale() {
        String f2 = f();
        if (TextUtils.isEmpty(f2)) {
            jav c2 = hqp.c();
            Locale q = c2 == null ? null : c2.q();
            return q != null ? q.toString() : "";
        }
        return f2;
    }

    @Override // android.service.textservice.SpellCheckerService.Session
    public final void onClose() {
        j();
        super.onClose();
    }

    @Override // android.service.textservice.SpellCheckerService.Session
    public final void onCreate() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:373:0x08c4, code lost:
        if (r5.b == false) goto L178;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0104 A[Catch: all -> 0x0c16, TryCatch #9 {all -> 0x0c16, blocks: (B:544:0x000d, B:4:0x0021, B:6:0x0044, B:8:0x004a, B:13:0x0104, B:15:0x0108, B:16:0x010f, B:20:0x0158, B:22:0x015c, B:24:0x0166, B:27:0x017d, B:29:0x018a, B:32:0x0198, B:34:0x01a0, B:35:0x01c3, B:37:0x01c9, B:39:0x01d5, B:40:0x01da, B:42:0x01e6, B:43:0x01ec, B:45:0x01f5, B:46:0x01fa, B:47:0x01a5, B:49:0x01b3, B:51:0x01bf, B:52:0x020f, B:55:0x0215, B:57:0x0223, B:59:0x0231, B:61:0x0239, B:66:0x0461, B:413:0x0be8, B:415:0x0bec, B:417:0x0bf2, B:419:0x0c0a, B:422:0x0241, B:492:0x0120, B:494:0x0126, B:500:0x012b, B:502:0x013b, B:496:0x0149, B:498:0x0153, B:504:0x013e, B:506:0x0057, B:508:0x0061, B:509:0x0067, B:511:0x006b, B:514:0x0073, B:515:0x0089, B:517:0x008f, B:520:0x00a3, B:525:0x00b5, B:528:0x00c7, B:530:0x00d3, B:531:0x00d8, B:532:0x00dc, B:534:0x00e2, B:539:0x00f2, B:541:0x00fc, B:69:0x046e, B:95:0x055b, B:72:0x0584, B:74:0x058a, B:76:0x0590, B:77:0x05e0, B:88:0x05de, B:93:0x0555, B:90:0x0474, B:96:0x0483, B:98:0x0487, B:99:0x04b1, B:101:0x04bb, B:103:0x04c5, B:104:0x04d0, B:106:0x04da, B:109:0x04e0, B:114:0x04fb, B:115:0x051d, B:119:0x0528, B:78:0x0593, B:80:0x05a0, B:83:0x05a6, B:87:0x05b6), top: B:543:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0706 A[Catch: all -> 0x0c12, TryCatch #7 {all -> 0x0c12, blocks: (B:64:0x0447, B:121:0x05ec, B:123:0x05ef, B:127:0x06f1, B:128:0x05fd, B:130:0x060f, B:132:0x0624, B:136:0x0662, B:137:0x0636, B:139:0x0644, B:141:0x064a, B:143:0x0651, B:149:0x066b, B:151:0x0670, B:155:0x0678, B:157:0x068a, B:159:0x06aa, B:160:0x06be, B:162:0x06c4, B:164:0x06d8, B:167:0x06f9, B:168:0x0703, B:170:0x0706, B:173:0x07ad, B:178:0x08ca, B:181:0x0934, B:184:0x09a9, B:187:0x09e6, B:190:0x0a4b, B:191:0x0a55, B:193:0x0a5b, B:195:0x0a77, B:197:0x0a7b, B:199:0x0a7f, B:200:0x0a9c, B:202:0x0aa4, B:207:0x0ab0, B:209:0x0abc, B:211:0x0ae1, B:213:0x0af2, B:216:0x0b8e, B:217:0x0ae5, B:219:0x0aed, B:221:0x0afd, B:224:0x0b04, B:226:0x0b0b, B:228:0x0b32, B:229:0x0b38, B:231:0x0b5b, B:233:0x0b5f, B:235:0x0b62, B:238:0x0b65, B:242:0x0b87, B:247:0x0b79, B:249:0x0b92, B:251:0x0b9a, B:253:0x0bb7, B:255:0x0bcd, B:257:0x0bd6, B:258:0x0bd4, B:261:0x0bd9, B:264:0x0a82, B:266:0x0a86, B:267:0x0a8d, B:269:0x0a91, B:270:0x0a98, B:271:0x0a94, B:272:0x0a89, B:273:0x09ef, B:275:0x0a01, B:279:0x0a07, B:283:0x0a48, B:284:0x0a24, B:286:0x0a2c, B:288:0x0a38, B:290:0x0a3c, B:293:0x0a44, B:295:0x0a34, B:297:0x09b0, B:299:0x09b4, B:300:0x09c0, B:302:0x09c6, B:304:0x0943, B:306:0x0950, B:308:0x0956, B:310:0x095a, B:311:0x0971, B:313:0x0977, B:316:0x0985, B:319:0x098f, B:325:0x08d9, B:327:0x08df, B:329:0x08e5, B:330:0x08fc, B:332:0x0902, B:335:0x0910, B:338:0x091a, B:344:0x07c5, B:349:0x07dd, B:355:0x0808, B:363:0x088f, B:365:0x08a1, B:367:0x08af, B:370:0x08b4, B:372:0x08c2, B:374:0x08c6, B:375:0x0826, B:378:0x0832, B:380:0x0838, B:384:0x086e, B:382:0x0880, B:175:0x07bd, B:393:0x072a, B:424:0x0250, B:426:0x0254, B:429:0x0259, B:430:0x025c, B:432:0x025f, B:434:0x0298, B:437:0x02c8, B:447:0x02d7, B:449:0x02dd, B:452:0x02eb, B:443:0x0308, B:455:0x031f, B:459:0x03bf, B:460:0x032b, B:462:0x0338, B:464:0x037e, B:466:0x038e, B:471:0x03d7, B:474:0x0421, B:476:0x0427, B:478:0x0431, B:480:0x0434, B:482:0x0438, B:484:0x0444, B:487:0x0417), top: B:53:0x0213 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x07bd A[Catch: all -> 0x0c12, TRY_ENTER, TryCatch #7 {all -> 0x0c12, blocks: (B:64:0x0447, B:121:0x05ec, B:123:0x05ef, B:127:0x06f1, B:128:0x05fd, B:130:0x060f, B:132:0x0624, B:136:0x0662, B:137:0x0636, B:139:0x0644, B:141:0x064a, B:143:0x0651, B:149:0x066b, B:151:0x0670, B:155:0x0678, B:157:0x068a, B:159:0x06aa, B:160:0x06be, B:162:0x06c4, B:164:0x06d8, B:167:0x06f9, B:168:0x0703, B:170:0x0706, B:173:0x07ad, B:178:0x08ca, B:181:0x0934, B:184:0x09a9, B:187:0x09e6, B:190:0x0a4b, B:191:0x0a55, B:193:0x0a5b, B:195:0x0a77, B:197:0x0a7b, B:199:0x0a7f, B:200:0x0a9c, B:202:0x0aa4, B:207:0x0ab0, B:209:0x0abc, B:211:0x0ae1, B:213:0x0af2, B:216:0x0b8e, B:217:0x0ae5, B:219:0x0aed, B:221:0x0afd, B:224:0x0b04, B:226:0x0b0b, B:228:0x0b32, B:229:0x0b38, B:231:0x0b5b, B:233:0x0b5f, B:235:0x0b62, B:238:0x0b65, B:242:0x0b87, B:247:0x0b79, B:249:0x0b92, B:251:0x0b9a, B:253:0x0bb7, B:255:0x0bcd, B:257:0x0bd6, B:258:0x0bd4, B:261:0x0bd9, B:264:0x0a82, B:266:0x0a86, B:267:0x0a8d, B:269:0x0a91, B:270:0x0a98, B:271:0x0a94, B:272:0x0a89, B:273:0x09ef, B:275:0x0a01, B:279:0x0a07, B:283:0x0a48, B:284:0x0a24, B:286:0x0a2c, B:288:0x0a38, B:290:0x0a3c, B:293:0x0a44, B:295:0x0a34, B:297:0x09b0, B:299:0x09b4, B:300:0x09c0, B:302:0x09c6, B:304:0x0943, B:306:0x0950, B:308:0x0956, B:310:0x095a, B:311:0x0971, B:313:0x0977, B:316:0x0985, B:319:0x098f, B:325:0x08d9, B:327:0x08df, B:329:0x08e5, B:330:0x08fc, B:332:0x0902, B:335:0x0910, B:338:0x091a, B:344:0x07c5, B:349:0x07dd, B:355:0x0808, B:363:0x088f, B:365:0x08a1, B:367:0x08af, B:370:0x08b4, B:372:0x08c2, B:374:0x08c6, B:375:0x0826, B:378:0x0832, B:380:0x0838, B:384:0x086e, B:382:0x0880, B:175:0x07bd, B:393:0x072a, B:424:0x0250, B:426:0x0254, B:429:0x0259, B:430:0x025c, B:432:0x025f, B:434:0x0298, B:437:0x02c8, B:447:0x02d7, B:449:0x02dd, B:452:0x02eb, B:443:0x0308, B:455:0x031f, B:459:0x03bf, B:460:0x032b, B:462:0x0338, B:464:0x037e, B:466:0x038e, B:471:0x03d7, B:474:0x0421, B:476:0x0427, B:478:0x0431, B:480:0x0434, B:482:0x0438, B:484:0x0444, B:487:0x0417), top: B:53:0x0213 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0a5b A[Catch: all -> 0x0c12, LOOP:7: B:191:0x0a55->B:193:0x0a5b, LOOP_END, TryCatch #7 {all -> 0x0c12, blocks: (B:64:0x0447, B:121:0x05ec, B:123:0x05ef, B:127:0x06f1, B:128:0x05fd, B:130:0x060f, B:132:0x0624, B:136:0x0662, B:137:0x0636, B:139:0x0644, B:141:0x064a, B:143:0x0651, B:149:0x066b, B:151:0x0670, B:155:0x0678, B:157:0x068a, B:159:0x06aa, B:160:0x06be, B:162:0x06c4, B:164:0x06d8, B:167:0x06f9, B:168:0x0703, B:170:0x0706, B:173:0x07ad, B:178:0x08ca, B:181:0x0934, B:184:0x09a9, B:187:0x09e6, B:190:0x0a4b, B:191:0x0a55, B:193:0x0a5b, B:195:0x0a77, B:197:0x0a7b, B:199:0x0a7f, B:200:0x0a9c, B:202:0x0aa4, B:207:0x0ab0, B:209:0x0abc, B:211:0x0ae1, B:213:0x0af2, B:216:0x0b8e, B:217:0x0ae5, B:219:0x0aed, B:221:0x0afd, B:224:0x0b04, B:226:0x0b0b, B:228:0x0b32, B:229:0x0b38, B:231:0x0b5b, B:233:0x0b5f, B:235:0x0b62, B:238:0x0b65, B:242:0x0b87, B:247:0x0b79, B:249:0x0b92, B:251:0x0b9a, B:253:0x0bb7, B:255:0x0bcd, B:257:0x0bd6, B:258:0x0bd4, B:261:0x0bd9, B:264:0x0a82, B:266:0x0a86, B:267:0x0a8d, B:269:0x0a91, B:270:0x0a98, B:271:0x0a94, B:272:0x0a89, B:273:0x09ef, B:275:0x0a01, B:279:0x0a07, B:283:0x0a48, B:284:0x0a24, B:286:0x0a2c, B:288:0x0a38, B:290:0x0a3c, B:293:0x0a44, B:295:0x0a34, B:297:0x09b0, B:299:0x09b4, B:300:0x09c0, B:302:0x09c6, B:304:0x0943, B:306:0x0950, B:308:0x0956, B:310:0x095a, B:311:0x0971, B:313:0x0977, B:316:0x0985, B:319:0x098f, B:325:0x08d9, B:327:0x08df, B:329:0x08e5, B:330:0x08fc, B:332:0x0902, B:335:0x0910, B:338:0x091a, B:344:0x07c5, B:349:0x07dd, B:355:0x0808, B:363:0x088f, B:365:0x08a1, B:367:0x08af, B:370:0x08b4, B:372:0x08c2, B:374:0x08c6, B:375:0x0826, B:378:0x0832, B:380:0x0838, B:384:0x086e, B:382:0x0880, B:175:0x07bd, B:393:0x072a, B:424:0x0250, B:426:0x0254, B:429:0x0259, B:430:0x025c, B:432:0x025f, B:434:0x0298, B:437:0x02c8, B:447:0x02d7, B:449:0x02dd, B:452:0x02eb, B:443:0x0308, B:455:0x031f, B:459:0x03bf, B:460:0x032b, B:462:0x0338, B:464:0x037e, B:466:0x038e, B:471:0x03d7, B:474:0x0421, B:476:0x0427, B:478:0x0431, B:480:0x0434, B:482:0x0438, B:484:0x0444, B:487:0x0417), top: B:53:0x0213 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0abc A[Catch: all -> 0x0c12, TryCatch #7 {all -> 0x0c12, blocks: (B:64:0x0447, B:121:0x05ec, B:123:0x05ef, B:127:0x06f1, B:128:0x05fd, B:130:0x060f, B:132:0x0624, B:136:0x0662, B:137:0x0636, B:139:0x0644, B:141:0x064a, B:143:0x0651, B:149:0x066b, B:151:0x0670, B:155:0x0678, B:157:0x068a, B:159:0x06aa, B:160:0x06be, B:162:0x06c4, B:164:0x06d8, B:167:0x06f9, B:168:0x0703, B:170:0x0706, B:173:0x07ad, B:178:0x08ca, B:181:0x0934, B:184:0x09a9, B:187:0x09e6, B:190:0x0a4b, B:191:0x0a55, B:193:0x0a5b, B:195:0x0a77, B:197:0x0a7b, B:199:0x0a7f, B:200:0x0a9c, B:202:0x0aa4, B:207:0x0ab0, B:209:0x0abc, B:211:0x0ae1, B:213:0x0af2, B:216:0x0b8e, B:217:0x0ae5, B:219:0x0aed, B:221:0x0afd, B:224:0x0b04, B:226:0x0b0b, B:228:0x0b32, B:229:0x0b38, B:231:0x0b5b, B:233:0x0b5f, B:235:0x0b62, B:238:0x0b65, B:242:0x0b87, B:247:0x0b79, B:249:0x0b92, B:251:0x0b9a, B:253:0x0bb7, B:255:0x0bcd, B:257:0x0bd6, B:258:0x0bd4, B:261:0x0bd9, B:264:0x0a82, B:266:0x0a86, B:267:0x0a8d, B:269:0x0a91, B:270:0x0a98, B:271:0x0a94, B:272:0x0a89, B:273:0x09ef, B:275:0x0a01, B:279:0x0a07, B:283:0x0a48, B:284:0x0a24, B:286:0x0a2c, B:288:0x0a38, B:290:0x0a3c, B:293:0x0a44, B:295:0x0a34, B:297:0x09b0, B:299:0x09b4, B:300:0x09c0, B:302:0x09c6, B:304:0x0943, B:306:0x0950, B:308:0x0956, B:310:0x095a, B:311:0x0971, B:313:0x0977, B:316:0x0985, B:319:0x098f, B:325:0x08d9, B:327:0x08df, B:329:0x08e5, B:330:0x08fc, B:332:0x0902, B:335:0x0910, B:338:0x091a, B:344:0x07c5, B:349:0x07dd, B:355:0x0808, B:363:0x088f, B:365:0x08a1, B:367:0x08af, B:370:0x08b4, B:372:0x08c2, B:374:0x08c6, B:375:0x0826, B:378:0x0832, B:380:0x0838, B:384:0x086e, B:382:0x0880, B:175:0x07bd, B:393:0x072a, B:424:0x0250, B:426:0x0254, B:429:0x0259, B:430:0x025c, B:432:0x025f, B:434:0x0298, B:437:0x02c8, B:447:0x02d7, B:449:0x02dd, B:452:0x02eb, B:443:0x0308, B:455:0x031f, B:459:0x03bf, B:460:0x032b, B:462:0x0338, B:464:0x037e, B:466:0x038e, B:471:0x03d7, B:474:0x0421, B:476:0x0427, B:478:0x0431, B:480:0x0434, B:482:0x0438, B:484:0x0444, B:487:0x0417), top: B:53:0x0213 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0b9a A[Catch: all -> 0x0c12, TryCatch #7 {all -> 0x0c12, blocks: (B:64:0x0447, B:121:0x05ec, B:123:0x05ef, B:127:0x06f1, B:128:0x05fd, B:130:0x060f, B:132:0x0624, B:136:0x0662, B:137:0x0636, B:139:0x0644, B:141:0x064a, B:143:0x0651, B:149:0x066b, B:151:0x0670, B:155:0x0678, B:157:0x068a, B:159:0x06aa, B:160:0x06be, B:162:0x06c4, B:164:0x06d8, B:167:0x06f9, B:168:0x0703, B:170:0x0706, B:173:0x07ad, B:178:0x08ca, B:181:0x0934, B:184:0x09a9, B:187:0x09e6, B:190:0x0a4b, B:191:0x0a55, B:193:0x0a5b, B:195:0x0a77, B:197:0x0a7b, B:199:0x0a7f, B:200:0x0a9c, B:202:0x0aa4, B:207:0x0ab0, B:209:0x0abc, B:211:0x0ae1, B:213:0x0af2, B:216:0x0b8e, B:217:0x0ae5, B:219:0x0aed, B:221:0x0afd, B:224:0x0b04, B:226:0x0b0b, B:228:0x0b32, B:229:0x0b38, B:231:0x0b5b, B:233:0x0b5f, B:235:0x0b62, B:238:0x0b65, B:242:0x0b87, B:247:0x0b79, B:249:0x0b92, B:251:0x0b9a, B:253:0x0bb7, B:255:0x0bcd, B:257:0x0bd6, B:258:0x0bd4, B:261:0x0bd9, B:264:0x0a82, B:266:0x0a86, B:267:0x0a8d, B:269:0x0a91, B:270:0x0a98, B:271:0x0a94, B:272:0x0a89, B:273:0x09ef, B:275:0x0a01, B:279:0x0a07, B:283:0x0a48, B:284:0x0a24, B:286:0x0a2c, B:288:0x0a38, B:290:0x0a3c, B:293:0x0a44, B:295:0x0a34, B:297:0x09b0, B:299:0x09b4, B:300:0x09c0, B:302:0x09c6, B:304:0x0943, B:306:0x0950, B:308:0x0956, B:310:0x095a, B:311:0x0971, B:313:0x0977, B:316:0x0985, B:319:0x098f, B:325:0x08d9, B:327:0x08df, B:329:0x08e5, B:330:0x08fc, B:332:0x0902, B:335:0x0910, B:338:0x091a, B:344:0x07c5, B:349:0x07dd, B:355:0x0808, B:363:0x088f, B:365:0x08a1, B:367:0x08af, B:370:0x08b4, B:372:0x08c2, B:374:0x08c6, B:375:0x0826, B:378:0x0832, B:380:0x0838, B:384:0x086e, B:382:0x0880, B:175:0x07bd, B:393:0x072a, B:424:0x0250, B:426:0x0254, B:429:0x0259, B:430:0x025c, B:432:0x025f, B:434:0x0298, B:437:0x02c8, B:447:0x02d7, B:449:0x02dd, B:452:0x02eb, B:443:0x0308, B:455:0x031f, B:459:0x03bf, B:460:0x032b, B:462:0x0338, B:464:0x037e, B:466:0x038e, B:471:0x03d7, B:474:0x0421, B:476:0x0427, B:478:0x0431, B:480:0x0434, B:482:0x0438, B:484:0x0444, B:487:0x0417), top: B:53:0x0213 }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0be0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0a86 A[Catch: all -> 0x0c12, TryCatch #7 {all -> 0x0c12, blocks: (B:64:0x0447, B:121:0x05ec, B:123:0x05ef, B:127:0x06f1, B:128:0x05fd, B:130:0x060f, B:132:0x0624, B:136:0x0662, B:137:0x0636, B:139:0x0644, B:141:0x064a, B:143:0x0651, B:149:0x066b, B:151:0x0670, B:155:0x0678, B:157:0x068a, B:159:0x06aa, B:160:0x06be, B:162:0x06c4, B:164:0x06d8, B:167:0x06f9, B:168:0x0703, B:170:0x0706, B:173:0x07ad, B:178:0x08ca, B:181:0x0934, B:184:0x09a9, B:187:0x09e6, B:190:0x0a4b, B:191:0x0a55, B:193:0x0a5b, B:195:0x0a77, B:197:0x0a7b, B:199:0x0a7f, B:200:0x0a9c, B:202:0x0aa4, B:207:0x0ab0, B:209:0x0abc, B:211:0x0ae1, B:213:0x0af2, B:216:0x0b8e, B:217:0x0ae5, B:219:0x0aed, B:221:0x0afd, B:224:0x0b04, B:226:0x0b0b, B:228:0x0b32, B:229:0x0b38, B:231:0x0b5b, B:233:0x0b5f, B:235:0x0b62, B:238:0x0b65, B:242:0x0b87, B:247:0x0b79, B:249:0x0b92, B:251:0x0b9a, B:253:0x0bb7, B:255:0x0bcd, B:257:0x0bd6, B:258:0x0bd4, B:261:0x0bd9, B:264:0x0a82, B:266:0x0a86, B:267:0x0a8d, B:269:0x0a91, B:270:0x0a98, B:271:0x0a94, B:272:0x0a89, B:273:0x09ef, B:275:0x0a01, B:279:0x0a07, B:283:0x0a48, B:284:0x0a24, B:286:0x0a2c, B:288:0x0a38, B:290:0x0a3c, B:293:0x0a44, B:295:0x0a34, B:297:0x09b0, B:299:0x09b4, B:300:0x09c0, B:302:0x09c6, B:304:0x0943, B:306:0x0950, B:308:0x0956, B:310:0x095a, B:311:0x0971, B:313:0x0977, B:316:0x0985, B:319:0x098f, B:325:0x08d9, B:327:0x08df, B:329:0x08e5, B:330:0x08fc, B:332:0x0902, B:335:0x0910, B:338:0x091a, B:344:0x07c5, B:349:0x07dd, B:355:0x0808, B:363:0x088f, B:365:0x08a1, B:367:0x08af, B:370:0x08b4, B:372:0x08c2, B:374:0x08c6, B:375:0x0826, B:378:0x0832, B:380:0x0838, B:384:0x086e, B:382:0x0880, B:175:0x07bd, B:393:0x072a, B:424:0x0250, B:426:0x0254, B:429:0x0259, B:430:0x025c, B:432:0x025f, B:434:0x0298, B:437:0x02c8, B:447:0x02d7, B:449:0x02dd, B:452:0x02eb, B:443:0x0308, B:455:0x031f, B:459:0x03bf, B:460:0x032b, B:462:0x0338, B:464:0x037e, B:466:0x038e, B:471:0x03d7, B:474:0x0421, B:476:0x0427, B:478:0x0431, B:480:0x0434, B:482:0x0438, B:484:0x0444, B:487:0x0417), top: B:53:0x0213 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0a91 A[Catch: all -> 0x0c12, TryCatch #7 {all -> 0x0c12, blocks: (B:64:0x0447, B:121:0x05ec, B:123:0x05ef, B:127:0x06f1, B:128:0x05fd, B:130:0x060f, B:132:0x0624, B:136:0x0662, B:137:0x0636, B:139:0x0644, B:141:0x064a, B:143:0x0651, B:149:0x066b, B:151:0x0670, B:155:0x0678, B:157:0x068a, B:159:0x06aa, B:160:0x06be, B:162:0x06c4, B:164:0x06d8, B:167:0x06f9, B:168:0x0703, B:170:0x0706, B:173:0x07ad, B:178:0x08ca, B:181:0x0934, B:184:0x09a9, B:187:0x09e6, B:190:0x0a4b, B:191:0x0a55, B:193:0x0a5b, B:195:0x0a77, B:197:0x0a7b, B:199:0x0a7f, B:200:0x0a9c, B:202:0x0aa4, B:207:0x0ab0, B:209:0x0abc, B:211:0x0ae1, B:213:0x0af2, B:216:0x0b8e, B:217:0x0ae5, B:219:0x0aed, B:221:0x0afd, B:224:0x0b04, B:226:0x0b0b, B:228:0x0b32, B:229:0x0b38, B:231:0x0b5b, B:233:0x0b5f, B:235:0x0b62, B:238:0x0b65, B:242:0x0b87, B:247:0x0b79, B:249:0x0b92, B:251:0x0b9a, B:253:0x0bb7, B:255:0x0bcd, B:257:0x0bd6, B:258:0x0bd4, B:261:0x0bd9, B:264:0x0a82, B:266:0x0a86, B:267:0x0a8d, B:269:0x0a91, B:270:0x0a98, B:271:0x0a94, B:272:0x0a89, B:273:0x09ef, B:275:0x0a01, B:279:0x0a07, B:283:0x0a48, B:284:0x0a24, B:286:0x0a2c, B:288:0x0a38, B:290:0x0a3c, B:293:0x0a44, B:295:0x0a34, B:297:0x09b0, B:299:0x09b4, B:300:0x09c0, B:302:0x09c6, B:304:0x0943, B:306:0x0950, B:308:0x0956, B:310:0x095a, B:311:0x0971, B:313:0x0977, B:316:0x0985, B:319:0x098f, B:325:0x08d9, B:327:0x08df, B:329:0x08e5, B:330:0x08fc, B:332:0x0902, B:335:0x0910, B:338:0x091a, B:344:0x07c5, B:349:0x07dd, B:355:0x0808, B:363:0x088f, B:365:0x08a1, B:367:0x08af, B:370:0x08b4, B:372:0x08c2, B:374:0x08c6, B:375:0x0826, B:378:0x0832, B:380:0x0838, B:384:0x086e, B:382:0x0880, B:175:0x07bd, B:393:0x072a, B:424:0x0250, B:426:0x0254, B:429:0x0259, B:430:0x025c, B:432:0x025f, B:434:0x0298, B:437:0x02c8, B:447:0x02d7, B:449:0x02dd, B:452:0x02eb, B:443:0x0308, B:455:0x031f, B:459:0x03bf, B:460:0x032b, B:462:0x0338, B:464:0x037e, B:466:0x038e, B:471:0x03d7, B:474:0x0421, B:476:0x0427, B:478:0x0431, B:480:0x0434, B:482:0x0438, B:484:0x0444, B:487:0x0417), top: B:53:0x0213 }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0a94 A[Catch: all -> 0x0c12, TryCatch #7 {all -> 0x0c12, blocks: (B:64:0x0447, B:121:0x05ec, B:123:0x05ef, B:127:0x06f1, B:128:0x05fd, B:130:0x060f, B:132:0x0624, B:136:0x0662, B:137:0x0636, B:139:0x0644, B:141:0x064a, B:143:0x0651, B:149:0x066b, B:151:0x0670, B:155:0x0678, B:157:0x068a, B:159:0x06aa, B:160:0x06be, B:162:0x06c4, B:164:0x06d8, B:167:0x06f9, B:168:0x0703, B:170:0x0706, B:173:0x07ad, B:178:0x08ca, B:181:0x0934, B:184:0x09a9, B:187:0x09e6, B:190:0x0a4b, B:191:0x0a55, B:193:0x0a5b, B:195:0x0a77, B:197:0x0a7b, B:199:0x0a7f, B:200:0x0a9c, B:202:0x0aa4, B:207:0x0ab0, B:209:0x0abc, B:211:0x0ae1, B:213:0x0af2, B:216:0x0b8e, B:217:0x0ae5, B:219:0x0aed, B:221:0x0afd, B:224:0x0b04, B:226:0x0b0b, B:228:0x0b32, B:229:0x0b38, B:231:0x0b5b, B:233:0x0b5f, B:235:0x0b62, B:238:0x0b65, B:242:0x0b87, B:247:0x0b79, B:249:0x0b92, B:251:0x0b9a, B:253:0x0bb7, B:255:0x0bcd, B:257:0x0bd6, B:258:0x0bd4, B:261:0x0bd9, B:264:0x0a82, B:266:0x0a86, B:267:0x0a8d, B:269:0x0a91, B:270:0x0a98, B:271:0x0a94, B:272:0x0a89, B:273:0x09ef, B:275:0x0a01, B:279:0x0a07, B:283:0x0a48, B:284:0x0a24, B:286:0x0a2c, B:288:0x0a38, B:290:0x0a3c, B:293:0x0a44, B:295:0x0a34, B:297:0x09b0, B:299:0x09b4, B:300:0x09c0, B:302:0x09c6, B:304:0x0943, B:306:0x0950, B:308:0x0956, B:310:0x095a, B:311:0x0971, B:313:0x0977, B:316:0x0985, B:319:0x098f, B:325:0x08d9, B:327:0x08df, B:329:0x08e5, B:330:0x08fc, B:332:0x0902, B:335:0x0910, B:338:0x091a, B:344:0x07c5, B:349:0x07dd, B:355:0x0808, B:363:0x088f, B:365:0x08a1, B:367:0x08af, B:370:0x08b4, B:372:0x08c2, B:374:0x08c6, B:375:0x0826, B:378:0x0832, B:380:0x0838, B:384:0x086e, B:382:0x0880, B:175:0x07bd, B:393:0x072a, B:424:0x0250, B:426:0x0254, B:429:0x0259, B:430:0x025c, B:432:0x025f, B:434:0x0298, B:437:0x02c8, B:447:0x02d7, B:449:0x02dd, B:452:0x02eb, B:443:0x0308, B:455:0x031f, B:459:0x03bf, B:460:0x032b, B:462:0x0338, B:464:0x037e, B:466:0x038e, B:471:0x03d7, B:474:0x0421, B:476:0x0427, B:478:0x0431, B:480:0x0434, B:482:0x0438, B:484:0x0444, B:487:0x0417), top: B:53:0x0213 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0a89 A[Catch: all -> 0x0c12, TryCatch #7 {all -> 0x0c12, blocks: (B:64:0x0447, B:121:0x05ec, B:123:0x05ef, B:127:0x06f1, B:128:0x05fd, B:130:0x060f, B:132:0x0624, B:136:0x0662, B:137:0x0636, B:139:0x0644, B:141:0x064a, B:143:0x0651, B:149:0x066b, B:151:0x0670, B:155:0x0678, B:157:0x068a, B:159:0x06aa, B:160:0x06be, B:162:0x06c4, B:164:0x06d8, B:167:0x06f9, B:168:0x0703, B:170:0x0706, B:173:0x07ad, B:178:0x08ca, B:181:0x0934, B:184:0x09a9, B:187:0x09e6, B:190:0x0a4b, B:191:0x0a55, B:193:0x0a5b, B:195:0x0a77, B:197:0x0a7b, B:199:0x0a7f, B:200:0x0a9c, B:202:0x0aa4, B:207:0x0ab0, B:209:0x0abc, B:211:0x0ae1, B:213:0x0af2, B:216:0x0b8e, B:217:0x0ae5, B:219:0x0aed, B:221:0x0afd, B:224:0x0b04, B:226:0x0b0b, B:228:0x0b32, B:229:0x0b38, B:231:0x0b5b, B:233:0x0b5f, B:235:0x0b62, B:238:0x0b65, B:242:0x0b87, B:247:0x0b79, B:249:0x0b92, B:251:0x0b9a, B:253:0x0bb7, B:255:0x0bcd, B:257:0x0bd6, B:258:0x0bd4, B:261:0x0bd9, B:264:0x0a82, B:266:0x0a86, B:267:0x0a8d, B:269:0x0a91, B:270:0x0a98, B:271:0x0a94, B:272:0x0a89, B:273:0x09ef, B:275:0x0a01, B:279:0x0a07, B:283:0x0a48, B:284:0x0a24, B:286:0x0a2c, B:288:0x0a38, B:290:0x0a3c, B:293:0x0a44, B:295:0x0a34, B:297:0x09b0, B:299:0x09b4, B:300:0x09c0, B:302:0x09c6, B:304:0x0943, B:306:0x0950, B:308:0x0956, B:310:0x095a, B:311:0x0971, B:313:0x0977, B:316:0x0985, B:319:0x098f, B:325:0x08d9, B:327:0x08df, B:329:0x08e5, B:330:0x08fc, B:332:0x0902, B:335:0x0910, B:338:0x091a, B:344:0x07c5, B:349:0x07dd, B:355:0x0808, B:363:0x088f, B:365:0x08a1, B:367:0x08af, B:370:0x08b4, B:372:0x08c2, B:374:0x08c6, B:375:0x0826, B:378:0x0832, B:380:0x0838, B:384:0x086e, B:382:0x0880, B:175:0x07bd, B:393:0x072a, B:424:0x0250, B:426:0x0254, B:429:0x0259, B:430:0x025c, B:432:0x025f, B:434:0x0298, B:437:0x02c8, B:447:0x02d7, B:449:0x02dd, B:452:0x02eb, B:443:0x0308, B:455:0x031f, B:459:0x03bf, B:460:0x032b, B:462:0x0338, B:464:0x037e, B:466:0x038e, B:471:0x03d7, B:474:0x0421, B:476:0x0427, B:478:0x0431, B:480:0x0434, B:482:0x0438, B:484:0x0444, B:487:0x0417), top: B:53:0x0213 }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x09ef A[Catch: all -> 0x0c12, TryCatch #7 {all -> 0x0c12, blocks: (B:64:0x0447, B:121:0x05ec, B:123:0x05ef, B:127:0x06f1, B:128:0x05fd, B:130:0x060f, B:132:0x0624, B:136:0x0662, B:137:0x0636, B:139:0x0644, B:141:0x064a, B:143:0x0651, B:149:0x066b, B:151:0x0670, B:155:0x0678, B:157:0x068a, B:159:0x06aa, B:160:0x06be, B:162:0x06c4, B:164:0x06d8, B:167:0x06f9, B:168:0x0703, B:170:0x0706, B:173:0x07ad, B:178:0x08ca, B:181:0x0934, B:184:0x09a9, B:187:0x09e6, B:190:0x0a4b, B:191:0x0a55, B:193:0x0a5b, B:195:0x0a77, B:197:0x0a7b, B:199:0x0a7f, B:200:0x0a9c, B:202:0x0aa4, B:207:0x0ab0, B:209:0x0abc, B:211:0x0ae1, B:213:0x0af2, B:216:0x0b8e, B:217:0x0ae5, B:219:0x0aed, B:221:0x0afd, B:224:0x0b04, B:226:0x0b0b, B:228:0x0b32, B:229:0x0b38, B:231:0x0b5b, B:233:0x0b5f, B:235:0x0b62, B:238:0x0b65, B:242:0x0b87, B:247:0x0b79, B:249:0x0b92, B:251:0x0b9a, B:253:0x0bb7, B:255:0x0bcd, B:257:0x0bd6, B:258:0x0bd4, B:261:0x0bd9, B:264:0x0a82, B:266:0x0a86, B:267:0x0a8d, B:269:0x0a91, B:270:0x0a98, B:271:0x0a94, B:272:0x0a89, B:273:0x09ef, B:275:0x0a01, B:279:0x0a07, B:283:0x0a48, B:284:0x0a24, B:286:0x0a2c, B:288:0x0a38, B:290:0x0a3c, B:293:0x0a44, B:295:0x0a34, B:297:0x09b0, B:299:0x09b4, B:300:0x09c0, B:302:0x09c6, B:304:0x0943, B:306:0x0950, B:308:0x0956, B:310:0x095a, B:311:0x0971, B:313:0x0977, B:316:0x0985, B:319:0x098f, B:325:0x08d9, B:327:0x08df, B:329:0x08e5, B:330:0x08fc, B:332:0x0902, B:335:0x0910, B:338:0x091a, B:344:0x07c5, B:349:0x07dd, B:355:0x0808, B:363:0x088f, B:365:0x08a1, B:367:0x08af, B:370:0x08b4, B:372:0x08c2, B:374:0x08c6, B:375:0x0826, B:378:0x0832, B:380:0x0838, B:384:0x086e, B:382:0x0880, B:175:0x07bd, B:393:0x072a, B:424:0x0250, B:426:0x0254, B:429:0x0259, B:430:0x025c, B:432:0x025f, B:434:0x0298, B:437:0x02c8, B:447:0x02d7, B:449:0x02dd, B:452:0x02eb, B:443:0x0308, B:455:0x031f, B:459:0x03bf, B:460:0x032b, B:462:0x0338, B:464:0x037e, B:466:0x038e, B:471:0x03d7, B:474:0x0421, B:476:0x0427, B:478:0x0431, B:480:0x0434, B:482:0x0438, B:484:0x0444, B:487:0x0417), top: B:53:0x0213 }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x09c6 A[Catch: all -> 0x0c12, LOOP:12: B:300:0x09c0->B:302:0x09c6, LOOP_END, TryCatch #7 {all -> 0x0c12, blocks: (B:64:0x0447, B:121:0x05ec, B:123:0x05ef, B:127:0x06f1, B:128:0x05fd, B:130:0x060f, B:132:0x0624, B:136:0x0662, B:137:0x0636, B:139:0x0644, B:141:0x064a, B:143:0x0651, B:149:0x066b, B:151:0x0670, B:155:0x0678, B:157:0x068a, B:159:0x06aa, B:160:0x06be, B:162:0x06c4, B:164:0x06d8, B:167:0x06f9, B:168:0x0703, B:170:0x0706, B:173:0x07ad, B:178:0x08ca, B:181:0x0934, B:184:0x09a9, B:187:0x09e6, B:190:0x0a4b, B:191:0x0a55, B:193:0x0a5b, B:195:0x0a77, B:197:0x0a7b, B:199:0x0a7f, B:200:0x0a9c, B:202:0x0aa4, B:207:0x0ab0, B:209:0x0abc, B:211:0x0ae1, B:213:0x0af2, B:216:0x0b8e, B:217:0x0ae5, B:219:0x0aed, B:221:0x0afd, B:224:0x0b04, B:226:0x0b0b, B:228:0x0b32, B:229:0x0b38, B:231:0x0b5b, B:233:0x0b5f, B:235:0x0b62, B:238:0x0b65, B:242:0x0b87, B:247:0x0b79, B:249:0x0b92, B:251:0x0b9a, B:253:0x0bb7, B:255:0x0bcd, B:257:0x0bd6, B:258:0x0bd4, B:261:0x0bd9, B:264:0x0a82, B:266:0x0a86, B:267:0x0a8d, B:269:0x0a91, B:270:0x0a98, B:271:0x0a94, B:272:0x0a89, B:273:0x09ef, B:275:0x0a01, B:279:0x0a07, B:283:0x0a48, B:284:0x0a24, B:286:0x0a2c, B:288:0x0a38, B:290:0x0a3c, B:293:0x0a44, B:295:0x0a34, B:297:0x09b0, B:299:0x09b4, B:300:0x09c0, B:302:0x09c6, B:304:0x0943, B:306:0x0950, B:308:0x0956, B:310:0x095a, B:311:0x0971, B:313:0x0977, B:316:0x0985, B:319:0x098f, B:325:0x08d9, B:327:0x08df, B:329:0x08e5, B:330:0x08fc, B:332:0x0902, B:335:0x0910, B:338:0x091a, B:344:0x07c5, B:349:0x07dd, B:355:0x0808, B:363:0x088f, B:365:0x08a1, B:367:0x08af, B:370:0x08b4, B:372:0x08c2, B:374:0x08c6, B:375:0x0826, B:378:0x0832, B:380:0x0838, B:384:0x086e, B:382:0x0880, B:175:0x07bd, B:393:0x072a, B:424:0x0250, B:426:0x0254, B:429:0x0259, B:430:0x025c, B:432:0x025f, B:434:0x0298, B:437:0x02c8, B:447:0x02d7, B:449:0x02dd, B:452:0x02eb, B:443:0x0308, B:455:0x031f, B:459:0x03bf, B:460:0x032b, B:462:0x0338, B:464:0x037e, B:466:0x038e, B:471:0x03d7, B:474:0x0421, B:476:0x0427, B:478:0x0431, B:480:0x0434, B:482:0x0438, B:484:0x0444, B:487:0x0417), top: B:53:0x0213 }] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0977 A[Catch: all -> 0x0c12, TryCatch #7 {all -> 0x0c12, blocks: (B:64:0x0447, B:121:0x05ec, B:123:0x05ef, B:127:0x06f1, B:128:0x05fd, B:130:0x060f, B:132:0x0624, B:136:0x0662, B:137:0x0636, B:139:0x0644, B:141:0x064a, B:143:0x0651, B:149:0x066b, B:151:0x0670, B:155:0x0678, B:157:0x068a, B:159:0x06aa, B:160:0x06be, B:162:0x06c4, B:164:0x06d8, B:167:0x06f9, B:168:0x0703, B:170:0x0706, B:173:0x07ad, B:178:0x08ca, B:181:0x0934, B:184:0x09a9, B:187:0x09e6, B:190:0x0a4b, B:191:0x0a55, B:193:0x0a5b, B:195:0x0a77, B:197:0x0a7b, B:199:0x0a7f, B:200:0x0a9c, B:202:0x0aa4, B:207:0x0ab0, B:209:0x0abc, B:211:0x0ae1, B:213:0x0af2, B:216:0x0b8e, B:217:0x0ae5, B:219:0x0aed, B:221:0x0afd, B:224:0x0b04, B:226:0x0b0b, B:228:0x0b32, B:229:0x0b38, B:231:0x0b5b, B:233:0x0b5f, B:235:0x0b62, B:238:0x0b65, B:242:0x0b87, B:247:0x0b79, B:249:0x0b92, B:251:0x0b9a, B:253:0x0bb7, B:255:0x0bcd, B:257:0x0bd6, B:258:0x0bd4, B:261:0x0bd9, B:264:0x0a82, B:266:0x0a86, B:267:0x0a8d, B:269:0x0a91, B:270:0x0a98, B:271:0x0a94, B:272:0x0a89, B:273:0x09ef, B:275:0x0a01, B:279:0x0a07, B:283:0x0a48, B:284:0x0a24, B:286:0x0a2c, B:288:0x0a38, B:290:0x0a3c, B:293:0x0a44, B:295:0x0a34, B:297:0x09b0, B:299:0x09b4, B:300:0x09c0, B:302:0x09c6, B:304:0x0943, B:306:0x0950, B:308:0x0956, B:310:0x095a, B:311:0x0971, B:313:0x0977, B:316:0x0985, B:319:0x098f, B:325:0x08d9, B:327:0x08df, B:329:0x08e5, B:330:0x08fc, B:332:0x0902, B:335:0x0910, B:338:0x091a, B:344:0x07c5, B:349:0x07dd, B:355:0x0808, B:363:0x088f, B:365:0x08a1, B:367:0x08af, B:370:0x08b4, B:372:0x08c2, B:374:0x08c6, B:375:0x0826, B:378:0x0832, B:380:0x0838, B:384:0x086e, B:382:0x0880, B:175:0x07bd, B:393:0x072a, B:424:0x0250, B:426:0x0254, B:429:0x0259, B:430:0x025c, B:432:0x025f, B:434:0x0298, B:437:0x02c8, B:447:0x02d7, B:449:0x02dd, B:452:0x02eb, B:443:0x0308, B:455:0x031f, B:459:0x03bf, B:460:0x032b, B:462:0x0338, B:464:0x037e, B:466:0x038e, B:471:0x03d7, B:474:0x0421, B:476:0x0427, B:478:0x0431, B:480:0x0434, B:482:0x0438, B:484:0x0444, B:487:0x0417), top: B:53:0x0213 }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0902 A[Catch: all -> 0x0c12, TryCatch #7 {all -> 0x0c12, blocks: (B:64:0x0447, B:121:0x05ec, B:123:0x05ef, B:127:0x06f1, B:128:0x05fd, B:130:0x060f, B:132:0x0624, B:136:0x0662, B:137:0x0636, B:139:0x0644, B:141:0x064a, B:143:0x0651, B:149:0x066b, B:151:0x0670, B:155:0x0678, B:157:0x068a, B:159:0x06aa, B:160:0x06be, B:162:0x06c4, B:164:0x06d8, B:167:0x06f9, B:168:0x0703, B:170:0x0706, B:173:0x07ad, B:178:0x08ca, B:181:0x0934, B:184:0x09a9, B:187:0x09e6, B:190:0x0a4b, B:191:0x0a55, B:193:0x0a5b, B:195:0x0a77, B:197:0x0a7b, B:199:0x0a7f, B:200:0x0a9c, B:202:0x0aa4, B:207:0x0ab0, B:209:0x0abc, B:211:0x0ae1, B:213:0x0af2, B:216:0x0b8e, B:217:0x0ae5, B:219:0x0aed, B:221:0x0afd, B:224:0x0b04, B:226:0x0b0b, B:228:0x0b32, B:229:0x0b38, B:231:0x0b5b, B:233:0x0b5f, B:235:0x0b62, B:238:0x0b65, B:242:0x0b87, B:247:0x0b79, B:249:0x0b92, B:251:0x0b9a, B:253:0x0bb7, B:255:0x0bcd, B:257:0x0bd6, B:258:0x0bd4, B:261:0x0bd9, B:264:0x0a82, B:266:0x0a86, B:267:0x0a8d, B:269:0x0a91, B:270:0x0a98, B:271:0x0a94, B:272:0x0a89, B:273:0x09ef, B:275:0x0a01, B:279:0x0a07, B:283:0x0a48, B:284:0x0a24, B:286:0x0a2c, B:288:0x0a38, B:290:0x0a3c, B:293:0x0a44, B:295:0x0a34, B:297:0x09b0, B:299:0x09b4, B:300:0x09c0, B:302:0x09c6, B:304:0x0943, B:306:0x0950, B:308:0x0956, B:310:0x095a, B:311:0x0971, B:313:0x0977, B:316:0x0985, B:319:0x098f, B:325:0x08d9, B:327:0x08df, B:329:0x08e5, B:330:0x08fc, B:332:0x0902, B:335:0x0910, B:338:0x091a, B:344:0x07c5, B:349:0x07dd, B:355:0x0808, B:363:0x088f, B:365:0x08a1, B:367:0x08af, B:370:0x08b4, B:372:0x08c2, B:374:0x08c6, B:375:0x0826, B:378:0x0832, B:380:0x0838, B:384:0x086e, B:382:0x0880, B:175:0x07bd, B:393:0x072a, B:424:0x0250, B:426:0x0254, B:429:0x0259, B:430:0x025c, B:432:0x025f, B:434:0x0298, B:437:0x02c8, B:447:0x02d7, B:449:0x02dd, B:452:0x02eb, B:443:0x0308, B:455:0x031f, B:459:0x03bf, B:460:0x032b, B:462:0x0338, B:464:0x037e, B:466:0x038e, B:471:0x03d7, B:474:0x0421, B:476:0x0427, B:478:0x0431, B:480:0x0434, B:482:0x0438, B:484:0x0444, B:487:0x0417), top: B:53:0x0213 }] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x07c5 A[Catch: all -> 0x0c12, TRY_LEAVE, TryCatch #7 {all -> 0x0c12, blocks: (B:64:0x0447, B:121:0x05ec, B:123:0x05ef, B:127:0x06f1, B:128:0x05fd, B:130:0x060f, B:132:0x0624, B:136:0x0662, B:137:0x0636, B:139:0x0644, B:141:0x064a, B:143:0x0651, B:149:0x066b, B:151:0x0670, B:155:0x0678, B:157:0x068a, B:159:0x06aa, B:160:0x06be, B:162:0x06c4, B:164:0x06d8, B:167:0x06f9, B:168:0x0703, B:170:0x0706, B:173:0x07ad, B:178:0x08ca, B:181:0x0934, B:184:0x09a9, B:187:0x09e6, B:190:0x0a4b, B:191:0x0a55, B:193:0x0a5b, B:195:0x0a77, B:197:0x0a7b, B:199:0x0a7f, B:200:0x0a9c, B:202:0x0aa4, B:207:0x0ab0, B:209:0x0abc, B:211:0x0ae1, B:213:0x0af2, B:216:0x0b8e, B:217:0x0ae5, B:219:0x0aed, B:221:0x0afd, B:224:0x0b04, B:226:0x0b0b, B:228:0x0b32, B:229:0x0b38, B:231:0x0b5b, B:233:0x0b5f, B:235:0x0b62, B:238:0x0b65, B:242:0x0b87, B:247:0x0b79, B:249:0x0b92, B:251:0x0b9a, B:253:0x0bb7, B:255:0x0bcd, B:257:0x0bd6, B:258:0x0bd4, B:261:0x0bd9, B:264:0x0a82, B:266:0x0a86, B:267:0x0a8d, B:269:0x0a91, B:270:0x0a98, B:271:0x0a94, B:272:0x0a89, B:273:0x09ef, B:275:0x0a01, B:279:0x0a07, B:283:0x0a48, B:284:0x0a24, B:286:0x0a2c, B:288:0x0a38, B:290:0x0a3c, B:293:0x0a44, B:295:0x0a34, B:297:0x09b0, B:299:0x09b4, B:300:0x09c0, B:302:0x09c6, B:304:0x0943, B:306:0x0950, B:308:0x0956, B:310:0x095a, B:311:0x0971, B:313:0x0977, B:316:0x0985, B:319:0x098f, B:325:0x08d9, B:327:0x08df, B:329:0x08e5, B:330:0x08fc, B:332:0x0902, B:335:0x0910, B:338:0x091a, B:344:0x07c5, B:349:0x07dd, B:355:0x0808, B:363:0x088f, B:365:0x08a1, B:367:0x08af, B:370:0x08b4, B:372:0x08c2, B:374:0x08c6, B:375:0x0826, B:378:0x0832, B:380:0x0838, B:384:0x086e, B:382:0x0880, B:175:0x07bd, B:393:0x072a, B:424:0x0250, B:426:0x0254, B:429:0x0259, B:430:0x025c, B:432:0x025f, B:434:0x0298, B:437:0x02c8, B:447:0x02d7, B:449:0x02dd, B:452:0x02eb, B:443:0x0308, B:455:0x031f, B:459:0x03bf, B:460:0x032b, B:462:0x0338, B:464:0x037e, B:466:0x038e, B:471:0x03d7, B:474:0x0421, B:476:0x0427, B:478:0x0431, B:480:0x0434, B:482:0x0438, B:484:0x0444, B:487:0x0417), top: B:53:0x0213 }] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x07b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0bec A[Catch: all -> 0x0c16, TryCatch #9 {all -> 0x0c16, blocks: (B:544:0x000d, B:4:0x0021, B:6:0x0044, B:8:0x004a, B:13:0x0104, B:15:0x0108, B:16:0x010f, B:20:0x0158, B:22:0x015c, B:24:0x0166, B:27:0x017d, B:29:0x018a, B:32:0x0198, B:34:0x01a0, B:35:0x01c3, B:37:0x01c9, B:39:0x01d5, B:40:0x01da, B:42:0x01e6, B:43:0x01ec, B:45:0x01f5, B:46:0x01fa, B:47:0x01a5, B:49:0x01b3, B:51:0x01bf, B:52:0x020f, B:55:0x0215, B:57:0x0223, B:59:0x0231, B:61:0x0239, B:66:0x0461, B:413:0x0be8, B:415:0x0bec, B:417:0x0bf2, B:419:0x0c0a, B:422:0x0241, B:492:0x0120, B:494:0x0126, B:500:0x012b, B:502:0x013b, B:496:0x0149, B:498:0x0153, B:504:0x013e, B:506:0x0057, B:508:0x0061, B:509:0x0067, B:511:0x006b, B:514:0x0073, B:515:0x0089, B:517:0x008f, B:520:0x00a3, B:525:0x00b5, B:528:0x00c7, B:530:0x00d3, B:531:0x00d8, B:532:0x00dc, B:534:0x00e2, B:539:0x00f2, B:541:0x00fc, B:69:0x046e, B:95:0x055b, B:72:0x0584, B:74:0x058a, B:76:0x0590, B:77:0x05e0, B:88:0x05de, B:93:0x0555, B:90:0x0474, B:96:0x0483, B:98:0x0487, B:99:0x04b1, B:101:0x04bb, B:103:0x04c5, B:104:0x04d0, B:106:0x04da, B:109:0x04e0, B:114:0x04fb, B:115:0x051d, B:119:0x0528, B:78:0x0593, B:80:0x05a0, B:83:0x05a6, B:87:0x05b6), top: B:543:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0427 A[Catch: all -> 0x0c12, TryCatch #7 {all -> 0x0c12, blocks: (B:64:0x0447, B:121:0x05ec, B:123:0x05ef, B:127:0x06f1, B:128:0x05fd, B:130:0x060f, B:132:0x0624, B:136:0x0662, B:137:0x0636, B:139:0x0644, B:141:0x064a, B:143:0x0651, B:149:0x066b, B:151:0x0670, B:155:0x0678, B:157:0x068a, B:159:0x06aa, B:160:0x06be, B:162:0x06c4, B:164:0x06d8, B:167:0x06f9, B:168:0x0703, B:170:0x0706, B:173:0x07ad, B:178:0x08ca, B:181:0x0934, B:184:0x09a9, B:187:0x09e6, B:190:0x0a4b, B:191:0x0a55, B:193:0x0a5b, B:195:0x0a77, B:197:0x0a7b, B:199:0x0a7f, B:200:0x0a9c, B:202:0x0aa4, B:207:0x0ab0, B:209:0x0abc, B:211:0x0ae1, B:213:0x0af2, B:216:0x0b8e, B:217:0x0ae5, B:219:0x0aed, B:221:0x0afd, B:224:0x0b04, B:226:0x0b0b, B:228:0x0b32, B:229:0x0b38, B:231:0x0b5b, B:233:0x0b5f, B:235:0x0b62, B:238:0x0b65, B:242:0x0b87, B:247:0x0b79, B:249:0x0b92, B:251:0x0b9a, B:253:0x0bb7, B:255:0x0bcd, B:257:0x0bd6, B:258:0x0bd4, B:261:0x0bd9, B:264:0x0a82, B:266:0x0a86, B:267:0x0a8d, B:269:0x0a91, B:270:0x0a98, B:271:0x0a94, B:272:0x0a89, B:273:0x09ef, B:275:0x0a01, B:279:0x0a07, B:283:0x0a48, B:284:0x0a24, B:286:0x0a2c, B:288:0x0a38, B:290:0x0a3c, B:293:0x0a44, B:295:0x0a34, B:297:0x09b0, B:299:0x09b4, B:300:0x09c0, B:302:0x09c6, B:304:0x0943, B:306:0x0950, B:308:0x0956, B:310:0x095a, B:311:0x0971, B:313:0x0977, B:316:0x0985, B:319:0x098f, B:325:0x08d9, B:327:0x08df, B:329:0x08e5, B:330:0x08fc, B:332:0x0902, B:335:0x0910, B:338:0x091a, B:344:0x07c5, B:349:0x07dd, B:355:0x0808, B:363:0x088f, B:365:0x08a1, B:367:0x08af, B:370:0x08b4, B:372:0x08c2, B:374:0x08c6, B:375:0x0826, B:378:0x0832, B:380:0x0838, B:384:0x086e, B:382:0x0880, B:175:0x07bd, B:393:0x072a, B:424:0x0250, B:426:0x0254, B:429:0x0259, B:430:0x025c, B:432:0x025f, B:434:0x0298, B:437:0x02c8, B:447:0x02d7, B:449:0x02dd, B:452:0x02eb, B:443:0x0308, B:455:0x031f, B:459:0x03bf, B:460:0x032b, B:462:0x0338, B:464:0x037e, B:466:0x038e, B:471:0x03d7, B:474:0x0421, B:476:0x0427, B:478:0x0431, B:480:0x0434, B:482:0x0438, B:484:0x0444, B:487:0x0417), top: B:53:0x0213 }] */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0434 A[Catch: all -> 0x0c12, TryCatch #7 {all -> 0x0c12, blocks: (B:64:0x0447, B:121:0x05ec, B:123:0x05ef, B:127:0x06f1, B:128:0x05fd, B:130:0x060f, B:132:0x0624, B:136:0x0662, B:137:0x0636, B:139:0x0644, B:141:0x064a, B:143:0x0651, B:149:0x066b, B:151:0x0670, B:155:0x0678, B:157:0x068a, B:159:0x06aa, B:160:0x06be, B:162:0x06c4, B:164:0x06d8, B:167:0x06f9, B:168:0x0703, B:170:0x0706, B:173:0x07ad, B:178:0x08ca, B:181:0x0934, B:184:0x09a9, B:187:0x09e6, B:190:0x0a4b, B:191:0x0a55, B:193:0x0a5b, B:195:0x0a77, B:197:0x0a7b, B:199:0x0a7f, B:200:0x0a9c, B:202:0x0aa4, B:207:0x0ab0, B:209:0x0abc, B:211:0x0ae1, B:213:0x0af2, B:216:0x0b8e, B:217:0x0ae5, B:219:0x0aed, B:221:0x0afd, B:224:0x0b04, B:226:0x0b0b, B:228:0x0b32, B:229:0x0b38, B:231:0x0b5b, B:233:0x0b5f, B:235:0x0b62, B:238:0x0b65, B:242:0x0b87, B:247:0x0b79, B:249:0x0b92, B:251:0x0b9a, B:253:0x0bb7, B:255:0x0bcd, B:257:0x0bd6, B:258:0x0bd4, B:261:0x0bd9, B:264:0x0a82, B:266:0x0a86, B:267:0x0a8d, B:269:0x0a91, B:270:0x0a98, B:271:0x0a94, B:272:0x0a89, B:273:0x09ef, B:275:0x0a01, B:279:0x0a07, B:283:0x0a48, B:284:0x0a24, B:286:0x0a2c, B:288:0x0a38, B:290:0x0a3c, B:293:0x0a44, B:295:0x0a34, B:297:0x09b0, B:299:0x09b4, B:300:0x09c0, B:302:0x09c6, B:304:0x0943, B:306:0x0950, B:308:0x0956, B:310:0x095a, B:311:0x0971, B:313:0x0977, B:316:0x0985, B:319:0x098f, B:325:0x08d9, B:327:0x08df, B:329:0x08e5, B:330:0x08fc, B:332:0x0902, B:335:0x0910, B:338:0x091a, B:344:0x07c5, B:349:0x07dd, B:355:0x0808, B:363:0x088f, B:365:0x08a1, B:367:0x08af, B:370:0x08b4, B:372:0x08c2, B:374:0x08c6, B:375:0x0826, B:378:0x0832, B:380:0x0838, B:384:0x086e, B:382:0x0880, B:175:0x07bd, B:393:0x072a, B:424:0x0250, B:426:0x0254, B:429:0x0259, B:430:0x025c, B:432:0x025f, B:434:0x0298, B:437:0x02c8, B:447:0x02d7, B:449:0x02dd, B:452:0x02eb, B:443:0x0308, B:455:0x031f, B:459:0x03bf, B:460:0x032b, B:462:0x0338, B:464:0x037e, B:466:0x038e, B:471:0x03d7, B:474:0x0421, B:476:0x0427, B:478:0x0431, B:480:0x0434, B:482:0x0438, B:484:0x0444, B:487:0x0417), top: B:53:0x0213 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x055b A[Catch: all -> 0x05e8, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x0c16, blocks: (B:544:0x000d, B:4:0x0021, B:6:0x0044, B:8:0x004a, B:13:0x0104, B:15:0x0108, B:16:0x010f, B:20:0x0158, B:22:0x015c, B:24:0x0166, B:27:0x017d, B:29:0x018a, B:32:0x0198, B:34:0x01a0, B:35:0x01c3, B:37:0x01c9, B:39:0x01d5, B:40:0x01da, B:42:0x01e6, B:43:0x01ec, B:45:0x01f5, B:46:0x01fa, B:47:0x01a5, B:49:0x01b3, B:51:0x01bf, B:52:0x020f, B:55:0x0215, B:57:0x0223, B:59:0x0231, B:61:0x0239, B:66:0x0461, B:413:0x0be8, B:415:0x0bec, B:417:0x0bf2, B:419:0x0c0a, B:422:0x0241, B:492:0x0120, B:494:0x0126, B:500:0x012b, B:502:0x013b, B:496:0x0149, B:498:0x0153, B:504:0x013e, B:506:0x0057, B:508:0x0061, B:509:0x0067, B:511:0x006b, B:514:0x0073, B:515:0x0089, B:517:0x008f, B:520:0x00a3, B:525:0x00b5, B:528:0x00c7, B:530:0x00d3, B:531:0x00d8, B:532:0x00dc, B:534:0x00e2, B:539:0x00f2, B:541:0x00fc, B:69:0x046e, B:95:0x055b, B:72:0x0584, B:74:0x058a, B:76:0x0590, B:77:0x05e0, B:88:0x05de, B:93:0x0555, B:90:0x0474, B:96:0x0483, B:98:0x0487, B:99:0x04b1, B:101:0x04bb, B:103:0x04c5, B:104:0x04d0, B:106:0x04da, B:109:0x04e0, B:114:0x04fb, B:115:0x051d, B:119:0x0528, B:78:0x0593, B:80:0x05a0, B:83:0x05a6, B:87:0x05b6), top: B:543:0x000d }] */
    /* JADX WARN: Type inference failed for: r2v65, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, java.lang.Iterable] */
    @Override // android.service.textservice.SpellCheckerService.Session
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.textservice.SentenceSuggestionsInfo[] onGetSentenceSuggestionsMultiple(android.view.textservice.TextInfo[] r30, int r31) {
        /*
            Method dump skipped, instructions count: 3099
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enj.onGetSentenceSuggestionsMultiple(android.view.textservice.TextInfo[], int):android.view.textservice.SentenceSuggestionsInfo[]");
    }

    @Override // android.service.textservice.SpellCheckerService.Session
    public final SuggestionsInfo onGetSuggestions(TextInfo textInfo, int i) {
        return a(textInfo == null ? "" : textInfo.getText(), new String[0], 0, i);
    }

    @Override // android.service.textservice.SpellCheckerService.Session
    public final SuggestionsInfo[] onGetSuggestionsMultiple(TextInfo[] textInfoArr, int i, boolean z) {
        String str;
        int length = textInfoArr.length;
        SuggestionsInfo[] suggestionsInfoArr = new SuggestionsInfo[length];
        String[] strArr = new String[length];
        int i2 = 0;
        while (true) {
            str = "";
            if (i2 < length) {
                TextInfo textInfo = textInfoArr[i2];
                if (textInfo != null) {
                    str = textInfo.getText();
                }
                strArr[i2] = str;
                i2++;
            }
        }
        for (int i3 = 0; i3 < length; i3++) {
            TextInfo textInfo2 = textInfoArr[i3];
            SuggestionsInfo a2 = a(textInfo2 == null ? str : textInfo2.getText(), strArr, i3, i);
            suggestionsInfoArr[i3] = a2;
            a2.setCookieAndSequence(textInfoArr[i3].getCookie(), textInfoArr[i3].getSequence());
        }
        return suggestionsInfoArr;
    }
}
