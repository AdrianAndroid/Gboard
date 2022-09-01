package defpackage;

/* compiled from: PG */
/* renamed from: idv  reason: default package */
/* loaded from: classes.dex */
public enum idv implements ids {
    USER_ACTION_TO_POPUP_SHOWN("TypingLatency.UserAction.PopupShown", 50),
    USER_ACTION_TO_POPUP_HIDDEN("TypingLatency.UserAction.PopupHidden", 50),
    USER_ACTION_TO_EVENT_FIRED("TypingLatency.UserAction.EventFired", 50),
    USER_ACTION_TO_IME_START_HANDLING("TypingLatency.UserAction.ImeStartsHandling", 50),
    USER_ACTION_TO_TEXT_FIELD_UPDATED("TypingLatency.UserAction.TextFieldUpdated", 50),
    USER_ACTION_TO_TEXT_FIELD_UPDATED_IGNORED("TypingLatency.UserAction.TextFieldUpdated.Ignored", 1000),
    USER_ACTION_TO_TEXT_FIELD_UPDATED_IGNORED_RESET("TypingLatency.UserAction.TextFieldUpdated.Ignored.Reset", 1000),
    USER_ACTION_TO_TEXT_CANDIDATES_UPDATED("TypingLatency.UserAction.TextCandidatesUpdated", 50),
    USER_ACTION_TO_TEXT_CANDIDATES_UPDATED_IGNORED("TypingLatency.UserAction.TextCandidatesUpdated.Ignored", 1000),
    USER_ACTION_TO_TEXT_CANDIDATES_UPDATED_IGNORED_RESET("TypingLatency.UserAction.TextCandidatesUpdated.Ignored.Reset", 1000),
    USER_ACTION_TO_NEXT_WORD_PREDICTION_UPDATED("TypingLatency.UserAction.NextWordPredictionUpdated", 50),
    USER_ACTION_TO_NEXT_WORD_PREDICTION_UPDATED_IGNORED("TypingLatency.UserAction.NextWordPredictionUpdated.Ignored", 1000),
    REQUEST_TO_CANDIDATE_APPENDED("TypingLatency.RequestTextCandidates.Appended", 50),
    REQUEST_TO_CANDIDATE_DRAWN("TypingLatency.RequestTextCandidates.Drawn", 50);
    
    private final String p;
    private final int q;

    idv(String str, int i) {
        this.p = str;
        this.q = i;
    }

    @Override // defpackage.idt
    public final int a() {
        return this.q;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.p;
    }
}
