package defpackage;

import com.google.android.apps.search.assistant.surfaces.voice.ui.speakables.Wiggle;
import com.google.android.libraries.search.p6glow.AssistantP6GlowView;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: klr  reason: default package */
/* loaded from: classes.dex */
public final class klr extends olm implements okq {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klr(int i) {
        super(1);
        this.b = i;
        this.a = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klr(Wiggle wiggle, int i) {
        super(1);
        this.b = i;
        this.a = wiggle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klr(AssistantP6GlowView assistantP6GlowView, int i) {
        super(1);
        this.b = i;
        this.a = assistantP6GlowView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klr(mzs mzsVar, int i) {
        super(1);
        this.b = i;
        this.a = mzsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klr(mzv mzvVar, int i) {
        super(1);
        this.b = i;
        this.a = mzvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klr(mzz mzzVar, int i) {
        super(1);
        this.b = i;
        this.a = mzzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klr(nab nabVar, int i) {
        super(1);
        this.b = i;
        this.a = nabVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klr(nac nacVar, int i) {
        super(1);
        this.b = i;
        this.a = nacVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klr(nas nasVar, int i) {
        super(1);
        this.b = i;
        this.a = nasVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klr(nbd nbdVar, int i) {
        super(1);
        this.b = i;
        this.a = nbdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klr(nbx nbxVar, int i) {
        super(1);
        this.b = i;
        this.a = nbxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klr(ojj ojjVar, int i) {
        super(1);
        this.b = i;
        this.a = ojjVar;
    }

    @Override // defpackage.okq
    public final /* synthetic */ Object a(Object obj) {
        switch (this.b) {
            case 0:
                ((Boolean) obj).booleanValue();
                ((AssistantP6GlowView) this.a).j();
                return oji.a;
            case 1:
                int intValue = ((Number) obj).intValue();
                Wiggle wiggle = (Wiggle) this.a;
                if (intValue != wiggle.getVisibility()) {
                    if (intValue == 0) {
                        wiggle.c();
                    } else {
                        wiggle.a();
                    }
                    wiggle.setVisibility(intValue);
                }
                return oji.a;
            case 2:
                float floatValue = ((Number) obj).floatValue();
                if (floatValue < 0.0f) {
                    throw new IllegalStateException("Check failed.");
                }
                if (floatValue <= 180.0f) {
                    AssistantP6GlowView.q((AssistantP6GlowView) this.a);
                    ((AssistantP6GlowView) this.a).j();
                    return oji.a;
                }
                throw new IllegalStateException("Check failed.");
            case 3:
                if (((Number) obj).floatValue() >= 0.0f) {
                    AssistantP6GlowView.q((AssistantP6GlowView) this.a);
                    ((AssistantP6GlowView) this.a).j();
                    return oji.a;
                }
                throw new IllegalStateException("Check failed.");
            case 4:
                float floatValue2 = ((Number) obj).floatValue();
                if (floatValue2 < 0.0f) {
                    throw new IllegalStateException("Check failed.");
                }
                if (floatValue2 <= 1.0f) {
                    AssistantP6GlowView.q((AssistantP6GlowView) this.a);
                    return oji.a;
                }
                throw new IllegalStateException("Check failed.");
            case 5:
                if (((Number) obj).floatValue() >= 0.0f) {
                    AssistantP6GlowView.q((AssistantP6GlowView) this.a);
                    return oji.a;
                }
                throw new IllegalStateException("Check failed.");
            case 6:
                float floatValue3 = ((Number) obj).floatValue();
                if (floatValue3 < 0.0f) {
                    throw new IllegalStateException("Check failed.");
                }
                if (floatValue3 <= 1.0f) {
                    AssistantP6GlowView.q((AssistantP6GlowView) this.a);
                    return oji.a;
                }
                throw new IllegalStateException("Check failed.");
            case 7:
                if (((Number) obj).floatValue() >= 0.0f) {
                    AssistantP6GlowView.q((AssistantP6GlowView) this.a);
                    return oji.a;
                }
                throw new IllegalStateException("Check failed.");
            case 8:
                oll.e((klp) obj, "it");
                AssistantP6GlowView.q((AssistantP6GlowView) this.a);
                ((AssistantP6GlowView) this.a).j();
                return oji.a;
            case 9:
                if (((Number) obj).floatValue() >= 0.0f) {
                    AssistantP6GlowView.q((AssistantP6GlowView) this.a);
                    return oji.a;
                }
                throw new IllegalStateException("Check failed.");
            case 10:
                if (((Number) obj).floatValue() >= 0.0f) {
                    AssistantP6GlowView.q((AssistantP6GlowView) this.a);
                    ((AssistantP6GlowView) this.a).j();
                    return oji.a;
                }
                throw new IllegalStateException("Check failed.");
            case 11:
                oll.e((mzt) obj, "it");
                mzz mzzVar = (mzz) this.a;
                return new mzu(null, mzzVar, mzzVar);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                mzt mztVar = (mzt) obj;
                oll.e(mztVar, "it");
                return mztVar.a((mzv) this.a);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                String str = (String) obj;
                oll.e(str, "input");
                ndb b = ((mzv) this.a).b(str, mzz.a);
                if (b instanceof mzu) {
                    return ((mzu) b).a;
                }
                if (!(b instanceof mzt)) {
                    throw new ojb();
                }
                throw new IllegalArgumentException("Parse Failed:\n" + b + "\n\nquery:\n" + str);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                mzt mztVar2 = (mzt) obj;
                oll.e(mztVar2, "it");
                return mztVar2.a((mzv) this.a);
            case 15:
                mzt mztVar3 = (mzt) obj;
                oll.e(mztVar3, "it");
                return mztVar3.a((mzv) this.a);
            case 16:
                oll.e((oji) obj, "it");
                return this.a;
            case 17:
                oll.e((oji) obj, "it");
                return this.a;
            case 18:
                oll.e((String) obj, "it");
                return this.a;
            case 19:
                return obj == this.a ? "(this Collection)" : String.valueOf(obj);
            default:
                String str2 = (String) obj;
                oll.e(str2, "line");
                return ((String) this.a).concat(String.valueOf(str2));
        }
    }
}
