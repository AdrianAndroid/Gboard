package defpackage;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.TextInfo;

/* compiled from: PG */
/* renamed from: ena  reason: default package */
/* loaded from: classes.dex */
public final class ena implements emx {
    private boolean a = false;
    private final idk b;

    public ena(idk idkVar) {
        this.b = idkVar;
    }

    @Override // defpackage.emx
    public final boolean a(TextInfo[] textInfoArr, SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        int i = 1;
        if (!hsx.d()) {
            int i2 = 0;
            int i3 = 0;
            for (SentenceSuggestionsInfo sentenceSuggestionsInfo : sentenceSuggestionsInfoArr) {
                int suggestionsCount = sentenceSuggestionsInfo.getSuggestionsCount();
                i2 += suggestionsCount;
                for (int i4 = 0; i4 < suggestionsCount; i4++) {
                    if ((sentenceSuggestionsInfo.getSuggestionsInfoAt(i4).getSuggestionsAttributes() & 2) != 0) {
                        i3++;
                    }
                }
            }
            float f = i2 == 0 ? 0.0f : i3 / i2;
            if (this.a) {
                if (f > ((Double) eng.e.c()).doubleValue()) {
                    this.a = false;
                }
            } else if (f < ((Double) eng.d.c()).doubleValue()) {
                this.a = true;
            }
            idk idkVar = this.b;
            iqu iquVar = iqu.SC_RULE_BASED_TRIGGER_MODEL;
            Object[] objArr = new Object[1];
            if (true != this.a) {
                i = 2;
            }
            objArr[0] = Integer.valueOf(i);
            idkVar.e(iquVar, objArr);
            return this.a;
        }
        this.b.e(iqu.SC_RULE_BASED_TRIGGER_MODEL, 0);
        return true;
    }

    @Override // defpackage.emx
    public final boolean b(TextInfo[] textInfoArr, String str) {
        return true;
    }
}
