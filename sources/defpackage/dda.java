package defpackage;

/* compiled from: PG */
/* renamed from: dda  reason: default package */
/* loaded from: classes.dex */
public enum dda implements ido {
    GESTURE_INPUT_STARTED("Input.action"),
    SETTINGS_ACTIVITY_CREATED,
    SETTINGS_ACTIVITY_FINISHED,
    PERIODIC_TASK_SERVICE_SUCCESS("PeriodicStats.success"),
    SHARED_PREFERENCE_CHANGED,
    SYNC_STATS_RECORDED,
    CRASH_DETECTED,
    IME_CONV_ID_LANGUAGE_LOADED_FROM_SETTINGS("ConvId.loadLanguageFromSettings"),
    IME_CONV_ID_LANGUAGE_SAVED_TO_SETTINGS("ConvId.saveLanguageToSettings"),
    DATA_PACKAGE_DOWNLOAD_SUCCEEDED,
    DATA_PACKAGE_DOWNLOAD_FAILED,
    DOWNLOADED_FILE_OPERATION_FAILED,
    DOWNLOADED_FILE_CHECKSUM_ERROR,
    DOWNLOADABLE_PACKAGE_ERROR("DownloadablePackage.error"),
    KEY_CORRECTION_NO_PREDICTIONS_FOUND,
    KEY_CORRECTION_TARGET_KEY_SELECTED,
    KEY_CORRECTION_APPLIED,
    SPECIAL_KEY_CORRECTIONS("KeyCorrection.specialKeys"),
    SUBCATEGORY_ACTION,
    DATA_HOUND_INPUT_CONNECTION_SET,
    USER_HISTORY_PRUNE_SIZE("DynamicLm.USER_HISTORY.pruneSize"),
    USER_HISTORY_SIZE_BEFORE_PRUNE("DynamicLm.USER_HISTORY.beforePruneSize"),
    SYLLABLE_MODE_USAGE,
    DAILY_PING,
    DUAL_CANDIDATES_VIEW_CONTROLLER_SELECTED_SUGGESTION_STRIP,
    DUAL_CANDIDATES_VIEW_CONTROLLER_SELECTED_MORE_CANDIDATES_AREA,
    OPENED_MORE_CANDIDATES_AREA("DualCandidatesViewController.openMoreCandidatesArea"),
    TASK_SCHEDULE_FAILED_USER_RUNNING("TaskFailed.UserRunning"),
    TASK_SCHEDULE_FAILED_USER_UNLOCKED("TaskFailed.UserUnlocked"),
    SPLIT_KEYBOARD_REQUESTED("Input.SplitKeyboardRequested"),
    NATIVE_LANGUAGE_HINT_OVERLAY_RESULT("NativeLanguageHint.Overlay.Result"),
    NATIVE_LANGUAGE_HINT_SEARCH_OVERLAY_RESULT,
    NATIVE_LANGUAGE_HINT_NOTICE_CLICKED("NativeLanguageHint.Notice.Clicked"),
    NATIVE_LANGUAGE_HINT_ADDED_SUGGESTED_LANGUAGE("NativeLanguageHint.AddedSuggestedLanguage"),
    NATIVE_LANGUAGE_HINT_ADDED_LAYOUT,
    NATIVE_LANGUAGE_HINT_USER_EVENTS("NativeLanguageHint.UserEvents"),
    NATIVE_LANGUAGE_HINT_SEARCH_USER_EVENTS("NativeLanguageHintSearch.UserEvents"),
    USER_UNLOCKED_BEFORE_REGISTRTING_RECEIVER("UserUnlocked.beforeRegisteringReceiver"),
    MORE_CANDIDATES_AREA_VISIBILITY_CHANGED,
    SUBCATEGORY_KEYBOARD_SWITCHED_BY_SWIPE("Input.SubcategoryKeyboardSwitchedBySwipe"),
    FEDERATED_LEARNING_STATUS,
    DIFFERENTIAL_PRIVACY_STATUS,
    SETUP_WIZARD_CREATED,
    SETUP_WIZARD_PAGE_SHOWN,
    SETUP_WIZARD_PAGE_FINISHED,
    SETUP_WIZARD_DESTROYED,
    SETUP_WIZARD_DONE_BUTTON_CLICKED,
    SETUP_WIZARD_SET_LANGUAGES_CLICKED,
    CONTACTS_PERMISSION_NOTICE_STATUS("ContactsPermission.NoticeStatus"),
    ON_TRIM_MEMORY("Memory.OnTrimMemory");
    
    public final String Y;

    dda() {
        this.Y = "";
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return 1000;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.Y;
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }

    dda(String str) {
        this.Y = str;
    }
}
