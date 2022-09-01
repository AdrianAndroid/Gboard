package defpackage;

/* compiled from: PG */
/* renamed from: hxx  reason: default package */
/* loaded from: classes.dex */
public enum hxx implements ido {
    HANDWRITING_PRESPACE_SYMBOL_RENDERING_CHECK_SUCCEEDED("Handwriting.prespaceRenderingCheck"),
    INPUT_CONTEXT_RESET("InputContext.Reset"),
    DYNAMIC_LM_STATS,
    TRAINING_CONTEXT_COMMITTED,
    DECODER_INITIALIZED_IN_YOUTUBE_SEARCH("Decoder.initInYoutubeSearch"),
    ZAWGYI_INIT("ZG.Init.Cnt"),
    RUNTIME_PARAMETERS_IME_ONACTIVATE,
    MAIN_LANGUAGE_MODELS_IME_ONACTIVATE,
    SCROLLABLE_CANDIDATE_VIEW_SCROLLED("ScrollableCandidateView.OnScrolled");
    
    private final String k;

    hxx() {
        this.k = "";
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return 1000;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.k;
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }

    hxx(String str) {
        this.k = str;
    }
}
