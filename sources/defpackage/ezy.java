package defpackage;

import java.text.Collator;
import java.util.Comparator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ezy  reason: default package */
/* loaded from: classes.dex */
public final class ezy implements Comparator {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ezy(ajk ajkVar, int i) {
        this.b = i;
        this.a = ajkVar;
    }

    public ezy(ihd ihdVar, int i) {
        this.b = i;
        this.a = ihdVar;
    }

    public ezy(Collator collator, int i) {
        this.b = i;
        this.a = collator;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i = this.b;
        if (i == 0) {
            return ((Collator) this.a).compare((String) ((Map.Entry) obj).getValue(), (String) ((Map.Entry) obj2).getValue());
        } else if (i == 1) {
            return Float.compare(((Float) ((ajk) this.a).a.get((String) obj2)).floatValue(), ((Float) ((ajk) this.a).a.get((String) obj)).floatValue());
        } else {
            float floatValue = ((Float) ((ihd) this.a).f.get(((Integer) obj).intValue())).floatValue() - ((Float) ((ihd) this.a).f.get(((Integer) obj2).intValue())).floatValue();
            if (floatValue < 0.0f) {
                return 1;
            }
            return floatValue <= 0.0f ? 0 : -1;
        }
    }
}
