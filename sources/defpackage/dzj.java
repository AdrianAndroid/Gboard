package defpackage;

import android.text.TextUtils;
import com.google.android.apps.inputmethod.libs.search.contentsuggestion.ContentSuggestionKeyboard;
import j$.util.Objects;
import j$.util.function.Predicate;
import java.io.File;
import java.util.Map;

/* compiled from: PG */
/* renamed from: dzj  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dzj implements Predicate {
    private final /* synthetic */ int l;
    public static final /* synthetic */ dzj k = new dzj(10);
    public static final /* synthetic */ dzj j = new dzj(9);
    public static final /* synthetic */ dzj i = new dzj(8);
    public static final /* synthetic */ dzj h = new dzj(7);
    public static final /* synthetic */ dzj g = new dzj(6);
    public static final /* synthetic */ dzj f = new dzj(5);
    public static final /* synthetic */ dzj e = new dzj(4);
    public static final /* synthetic */ dzj d = new dzj(3);
    public static final /* synthetic */ dzj c = new dzj(2);
    public static final /* synthetic */ dzj b = new dzj(1);
    public static final /* synthetic */ dzj a = new dzj(0);

    private /* synthetic */ dzj(int i2) {
        this.l = i2;
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.l) {
            case 0:
                return Objects.requireNonNull(predicate);
            case 1:
                return Objects.requireNonNull(predicate);
            case 2:
                return Objects.requireNonNull(predicate);
            case 3:
                return Objects.requireNonNull(predicate);
            case 4:
                return Objects.requireNonNull(predicate);
            case 5:
                return Objects.requireNonNull(predicate);
            case 6:
                return Objects.requireNonNull(predicate);
            case 7:
                return Objects.requireNonNull(predicate);
            case 8:
                return Objects.requireNonNull(predicate);
            case 9:
                return Objects.requireNonNull(predicate);
            default:
                return Objects.requireNonNull(predicate);
        }
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.l) {
            case 0:
                return Predicate.CC.$default$negate(this);
            case 1:
                return Predicate.CC.$default$negate(this);
            case 2:
                return Predicate.CC.$default$negate(this);
            case 3:
                return Predicate.CC.$default$negate(this);
            case 4:
                return Predicate.CC.$default$negate(this);
            case 5:
                return Predicate.CC.$default$negate(this);
            case 6:
                return Predicate.CC.$default$negate(this);
            case 7:
                return Predicate.CC.$default$negate(this);
            case 8:
                return Predicate.CC.$default$negate(this);
            case 9:
                return Predicate.CC.$default$negate(this);
            default:
                return Predicate.CC.$default$negate(this);
        }
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.l) {
            case 0:
                return Objects.requireNonNull(predicate);
            case 1:
                return Objects.requireNonNull(predicate);
            case 2:
                return Objects.requireNonNull(predicate);
            case 3:
                return Objects.requireNonNull(predicate);
            case 4:
                return Objects.requireNonNull(predicate);
            case 5:
                return Objects.requireNonNull(predicate);
            case 6:
                return Objects.requireNonNull(predicate);
            case 7:
                return Objects.requireNonNull(predicate);
            case 8:
                return Objects.requireNonNull(predicate);
            case 9:
                return Objects.requireNonNull(predicate);
            default:
                return Objects.requireNonNull(predicate);
        }
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.l) {
            case 0:
                ltg ltgVar = dzl.a;
                return ((dzq) obj).b() == 1;
            case 1:
                mwa mwaVar = ((mwc) obj).b;
                if (mwaVar == null) {
                    mwaVar = mwa.c;
                }
                return !mwaVar.b.isEmpty();
            case 2:
                ltg ltgVar2 = ContentSuggestionKeyboard.a;
                return ((dzq) obj).b() == 1;
            case 3:
                ltg ltgVar3 = egf.a;
                return ((efx) obj).e().g.size() >= ((Long) cwz.e.c()).intValue();
            case 4:
                return ((efx) obj).e().g.size() >= ((Long) cwz.e.c()).intValue();
            case 5:
                return !TextUtils.isEmpty((String) obj);
            case 6:
                return ((Boolean) obj).booleanValue();
            case 7:
                return ((File) obj).isDirectory();
            case 8:
                int i2 = fcr.c;
                return !((String) obj).isEmpty();
            case 9:
                int i3 = fcr.c;
                return !((String) obj).isEmpty();
            default:
                Map.Entry entry = (Map.Entry) obj;
                return ((lfe) entry.getValue()).a(((hhl) entry.getKey()).c());
        }
    }
}
